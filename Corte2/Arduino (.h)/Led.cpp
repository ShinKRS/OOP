#include "Led.h"
#include <Arduino.h>

Led::Led(int pin) {
  this->pin = pin;
  pinMode(pin, OUTPUT);
}

void Led::encender() {
  digitalWrite(pin, HIGH);
}

void Led::apagar() {
  digitalWrite(pin, LOW);
}
