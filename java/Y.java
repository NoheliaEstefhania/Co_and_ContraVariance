public class Y extends X {

  public Bcc foo(Acc a) {
    a.aaa();
    System.out.println("X.foo()");
    Bcc b = new Bcc();
    return b;
  }
}
