//find largest of 3 user inputted numbers using nested if

package conditionals;
import java.util.Scanner;

public class largestNum {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter first number:");
    int first=sc.nextInt();
    
    System.out.print("Enter second number:");
    int second=sc.nextInt();

    System.out.print("Enter third number:");
    int third=sc.nextInt();

    if(first>second){

      if(first>third){
        System.out.println(+first+ " is the largest number");
      }
      else{
        System.out.println(+third+ " is the largest number");
      }

    }

    else{

      if(second>third){
        System.out.println(+second+ " is the largest number");
      }
      else{
        System.out.println(+third+ " is the largest number");
      }

    }
    sc.close();
  }
}
