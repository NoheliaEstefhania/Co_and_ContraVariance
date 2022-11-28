public class Y extends X {

  public B foo(A a) {
    a.aaa();
    System.out.println("Y.foo()");
    B c = new Ccc();
    return c;
  }
}
