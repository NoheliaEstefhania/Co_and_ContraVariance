#ifndef Y_H
#define Y_H
#include "X.h"
#include "A.h"

class Y:public X {
  public:
    B *foo(B *b){
      b->bbb();
      B *c = new C;
      return c;
    }
};

#endif
