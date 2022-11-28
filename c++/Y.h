#ifndef Y_H
#define Y_H
#include "X.h"
#include "A.h"

class Y:public X {
  public:
    B foo(A);
};

#endif
