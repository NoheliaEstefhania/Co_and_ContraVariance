#include "A.h"
#include "B.h"
#include "C.h"
#include "X.h"
#include "Y.h"

int main(){
  X *x = new Y();
  A *a = new B();
  x->foo(a);
  return 0;  
}