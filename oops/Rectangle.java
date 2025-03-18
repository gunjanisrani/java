//Create a class named Rectangle with two instance variables: length and width. Create methods to calculate the area and perimeter of the rectangle. Create a Main class to create a Rectangle object and test its methods.

package oops;
import java.util.Scanner;

public class Rectangle {
  int length;
  int width;

  public int area(int length,int width){
    return (length*width);
  }

  public int perimeter(int length,int width){
    return (2*(length+width));
  }

  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter length of rectangle");
    int length=sc.nextInt();
    System.out.println("Enter width of rectangle");
    int width=sc.nextInt();

    Rectangle obj=new Rectangle();
    System.out.println("Area: " + obj.area(length,width));
    System.out.println("Perimeter: " + obj.perimeter(length,width));

    sc.close();
  }
}
