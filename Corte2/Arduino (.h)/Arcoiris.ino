#include "Led.h"
#include "Arcoiris.h"

// Crear objetos Led con los pines que tienes
Led ledAmarillo(2);
Led ledRojo(3);
Led ledVerde(4);
Led ledAzul(5);

// Crear el objeto Arcoiris
Arcoiris efecto(&ledAmarillo, &ledRojo, &ledVerde, &ledAzul, 300);

void setup() {
  // Todo se configura en los constructores
}

void loop() {
  efecto.mostrarSecuencia();
}
