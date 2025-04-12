package constructors;

public class Example {
  int x;

  Example(){
    x=5;
  }
  Example(int y){
    x=y;
  }
  public void display(){
    System.out.println("value of x is: "+x);
  }

  public static void main(String[] args) {
    Example obj1=new Example();
    Example obj2=new Example(10);
    obj1.display();
    obj2.display();
  }
}
