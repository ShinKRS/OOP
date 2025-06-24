#include "Led.h"
#include "Arcoiris.h"

Led ledAmarillo(2);
Led ledRojo(3);
Led ledVerde(4);

Arcoiris arcoiris(&ledAmarillo, &ledRojo, &ledVerde, 300);

void setup() {
  // Inicialización automática desde los constructores
}

void loop() {
  arcoiris.mostrarSecuencia();
}
