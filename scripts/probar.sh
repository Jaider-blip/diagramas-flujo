#!/usr/bin/env bash
# Compila los 24 programas y los ejecuta con sus entradas (ejNN.in), comparando con la salida esperada (ejNN.out).
# Uso:  ./scripts/probar.sh            -> compila y verifica
#       ./scripts/probar.sh --generar  -> regenera los ejNN.out (solo si cambiaste el comportamiento a propósito)
set -u
cd "$(dirname "$0")/.."
JAVAC="${JAVAC:-javac}"; JAVA="${JAVA:-java}"
OPCIONES="-Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8"
GENERAR=0; [ "${1:-}" = "--generar" ] && GENERAR=1

rm -rf out && mkdir out
$JAVAC -encoding UTF-8 -d out common/*.java $(find ejercicios -name '*.java') || { echo "ERROR de compilación"; exit 1; }
rm -f datos/*.csv datos/*.rel

fallos=0; total=0
# orden numérico: el ej. 67 crea el fichero que usan los ej. 69 y 70
for entrada in $(find ejercicios -name 'ej*.in' | sed 's#.*/ej\([0-9]*\)\.in#\1 &#' | sort -n | cut -d' ' -f2); do
  carpeta=$(dirname "$entrada"); base=$(basename "$entrada" .in)
  clase=$(basename "$carpeta"/*.java .java)
  salida=$(mktemp)
  $JAVA $OPCIONES -cp out "$clase" < "$entrada" > "$salida" 2>/dev/null
  total=$((total+1))
  if [ $GENERAR -eq 1 ]; then cp "$salida" "$carpeta/$base.out"; echo "generado  $clase"
  elif diff -q "$salida" "$carpeta/$base.out" >/dev/null; then echo "OK        $clase"
  else echo "FALLA     $clase"; diff "$salida" "$carpeta/$base.out" | head -5; fallos=$((fallos+1)); fi
  rm -f "$salida"
done
echo "---- $((total-fallos))/$total pruebas correctas"
[ $fallos -eq 0 ]
