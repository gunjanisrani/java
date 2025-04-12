package oops;

interface Shape{
  double getArea();
}
class rectangle implements Shape{
  double length;
  double breadth;
  rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }
  
  public double getArea(){
    return length*breadth;
  }
}

class circle implements Shape{
  double radius;
  circle(double radius) {
    this.radius = radius;
  }
  public double getArea(){
    return 3.14*radius*radius;
  }
}

class triangle implements Shape{
  double base;
  double height;
  triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }
  public double getArea(){
  
    return 0.5*base*height;
  }
}

public class Shapes {
  public static void main(String[] args) {
    Shape s1=new rectangle(5,4);
    Shape s2=new circle(3);
    Shape s3= new triangle(3,4);

    System.out.println("Area of rectangle: "+ s1.getArea());
    System.out.println("Area of circle: "+ s2.getArea());
    System.out.println("Area of triangle: "+ s3.getArea());
  }
}
