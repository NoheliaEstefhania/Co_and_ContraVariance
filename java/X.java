import java.beans.beancontext.BeanContext;

public class X {

  public B foo(B b){
    b.bbb();
    B c = new Ccc();
    System.out.println("X.foo()");
    return c;
  }
}
