//hierarchial inheritance
package inheritance;
class A{
  public void print_A(){
  System.out.println("A");
  }
}
class B extends A{
  public void print_B(){
  System.out.println("B");
  }
}
class C extends A{
  public void print_C(){
  System.out.println("C");
  }
}

public class Test {
  public static void main(String[] args) {
    
  
  B objB =new B();
  objB.print_A();
  objB.print_B();
  C objC =new C();
  objC.print_A();
  objC.print_C();
}
}