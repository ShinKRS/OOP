#include "Arcoiris.h"
#include <Arduino.h>

Arcoiris::Arcoiris(Led* a, Led* r, Led* v, int tiempo) {
  this->amarillo = a;
  this->rojo = r;
  this->verde = v;
  this->tiempo = tiempo;
}

void Arcoiris::mostrarSecuencia() {
  // Solo uno encendido a la vez
  amarillo->encender(); rojo->apagar(); verde->apagar();
  delay(tiempo);

  amarillo->apagar(); rojo->encender(); verde->apagar();
  delay(tiempo);

  amarillo->apagar(); rojo->apagar(); verde->encender();
  delay(tiempo);

  // Combinaciones
  amarillo->encender(); rojo->encender(); verde->apagar();
  delay(tiempo);

  amarillo->apagar(); rojo->encender(); verde->encender();
  delay(tiempo);

  amarillo->encender(); rojo->apagar(); verde->encender();
  delay(tiempo);

  // Todos encendidos
  amarillo->encender(); rojo->encender(); verde->encender();
  delay(tiempo);

  // Todos apagados
  amarillo->apagar(); rojo->apagar(); verde->apagar();
  delay(tiempo);
}

