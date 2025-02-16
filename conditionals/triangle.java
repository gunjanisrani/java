//To check whether the given 3 sides of a triangle form the sides of right angled triangle

package conditionals;
import java.util.Scanner;

public class triangle {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter first side of the triangle: ");
    int a=sc.nextInt();

    System.out.print("Enter second side of the triangle: ");
    int b=sc.nextInt();

    System.out.print("Enter third side of the triangle: ");
    int c=sc.nextInt();
    boolean ans=false;

    if((a*a)==(b*b)+(c*c)||(b*b)==(a*a)+(c*c)||(c*c)==(a*a)+(b*b)){
      ans=true;
    }
    
    if(ans){
      System.out.println("The triangle can form a right angled triangle");
    }
    else{
      System.out.println("The triangle cannot form a right angled triangle");
    }

  sc.close();
  }
  
}
