#ifndef ARCOIRIS_H
#define ARCOIRIS_H

#include "Led.h"

class Arcoiris {
  private:
    Led* amarillo;
    Led* rojo;
    Led* verde;
    Led* azul;
    int tiempo;

  public:
    Arcoiris(Led* a, Led* r, Led* v, Led* z, int tiempo = 300);
    void mostrarSecuencia();
};

#endif
