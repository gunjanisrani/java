//multilevel inheritance
package inheritance;

class one {
  public void geeks1(){
    System.out.print("Geeks");
  }
}
class two extends one{
  public void forr(){
    System.out.print("for");
  }
}
public class three extends two{
  public void geeks2(){
    System.out.print("Geeks");
  }
  public static void main(String[] args) {
    three obj=new three();
    obj.geeks1();
    obj.forr();
    obj.geeks2();

  }
}

