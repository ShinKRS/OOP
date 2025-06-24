#ifndef ARCOIRIS_H
#define ARCOIRIS_H

#include "Led.h"

class Arcoiris {
  private:
    Led* rojo;
    Led* verde;
    Led* azul;
    int delayTiempo;

  public:
    Arcoiris(Led* rojo, Led* verde, Led* azul, int delayTiempo = 300);
    void mostrar();
};

#endif
