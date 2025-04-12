package oops;

public class method_overloading {
  static void area(int s){
    System.out.println("area of square is "+(s*s));
  }
  static void area(int l,int b){
    System.out.println("area of rect is "+(2*(l+b)));
  }
  static void area(double b,double h){
    System.out.println("area of triangle is "+(0.5*b*h));
  }
  public static void main(String[] args) {
    area(3);
    area(1.2,0.1);
    area(4,5);
  }
}
