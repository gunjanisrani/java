//Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.

package oops;

interface shape{
    double getArea();
}


class Rectangle implements shape{
  int length,width;
  public Rectangle(int length,int width){
    this.length=length;
    this.width=width;
  }
  public double getArea(){
    return length*width;
  }
}

class Triangle implements shape{
  int base,height;
  public Triangle(int base,int height){
    this.base=base;
    this.height=height;
  }
  public double getArea(){
    return (0.5*base*height);
  }
}

class Circle implements shape{
  int radius;
  public Circle(int radius){
    this.radius=radius;
  }
  public double getArea(){
    return (3.14*radius*radius);
  }
}
public class Main {
  public static void main(String[] args) {
      
      shape Rectangle = new Rectangle(5, 4);
      shape Triangle= new Triangle(5,4);
      shape Circle= new Circle(5);

      System.out.println("Rectangle Area: " + Rectangle.getArea());
      System.out.println("Triangle Area: "+ Triangle.getArea());
      System.out.println("Circle Area: "+ Circle.getArea());
  }
}

