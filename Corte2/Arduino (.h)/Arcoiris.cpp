#include "Arcoiris.h"
#include <Arduino.h>

Arcoiris::Arcoiris(Led* a, Led* r, Led* v, Led* z, int tiempo) {
  this->amarillo = a;
  this->rojo = r;
  this->verde = v;
  this->azul = z;
  this->tiempo = tiempo;
}

void Arcoiris::mostrarSecuencia() {
  // Encender uno a la vez
  amarillo->encender(); rojo->apagar(); verde->apagar(); azul->apagar();
  delay(tiempo);

  amarillo->apagar(); rojo->encender(); verde->apagar(); azul->apagar();
  delay(tiempo);

  amarillo->apagar(); rojo->apagar(); verde->encender(); azul->apagar();
  delay(tiempo);

  amarillo->apagar(); rojo->apagar(); verde->apagar(); azul->encender();
  delay(tiempo);

  // Encender combinaciones de dos
  amarillo->encender(); rojo->encender(); verde->apagar(); azul->apagar();
  delay(tiempo);

  amarillo->apagar(); rojo->encender(); verde->encender(); azul->apagar();
  delay(tiempo);

  amarillo->apagar(); rojo->apagar(); verde->encender(); azul->encender();
  delay(tiempo);

  amarillo->encender(); rojo->apagar(); verde->apagar(); azul->encender();
  delay(tiempo);

  // Encender tres
  amarillo->encender(); rojo->encender(); verde->encender(); azul->apagar();
  delay(tiempo);

  rojo->encender(); verde->encender(); azul->encender(); amarillo->apagar();
  delay(tiempo);

  amarillo->encender(); verde->encender(); azul->encender(); rojo->apagar();
  delay(tiempo);

  amarillo->encender(); rojo->encender(); azul->encender(); verde->apagar();
  delay(tiempo);

  // Todos encendidos
  amarillo->encender(); rojo->encender(); verde->encender(); azul->encender();
  delay(tiempo);

  // Todos apagados
  amarillo->apagar(); rojo->apagar(); verde->apagar(); azul->apagar();
  delay(tiempo);
}


