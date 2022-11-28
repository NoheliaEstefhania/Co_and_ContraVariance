import java.beans.beancontext.BeanContext;

public class X {

  public Bcc foo(Bcc b){
    b.bbb();
    Bcc bb = new Bcc();
    System.out.println("Y: foo()");
    return bb;
  }
}
