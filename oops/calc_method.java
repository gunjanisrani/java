/*Create a method named calc, which accepts an integer (int), a character (char) and one more integer (int), and depending on the character, returns the result of the corresponding operation on numbers:
'+', '-', '*', '/' .
If the passed character does not match those listed above, then the method should return 0.
The calc method must be public and static, with a void return type.*/

package oops;
import java.util.Scanner;


public class calc_method {
  public static void calc(int a,char ch,int b){
    switch(ch){
      case '+':
      System.out.println("Addition results in " +(a+b));
      break;
      case '-':
      System.out.println("Subtraction results in " +(a-b));
      break;
      case '*':
      System.out.println("Multiplication results in " +(a*b));
      break;
      case '/':
      if(b==0){
        System.out.println("undefined");
      }
      else{
      System.out.println("Division results in " +(a/b));
      }
      break;
      default:
      System.out.println("0");
      break;
    }
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    System.out.println("Enter second number");
    int b=sc.nextInt();
    System.out.println("Enter an operator to be performed on these numbers");
    char ch=sc.next().charAt(0);
    calc(a,ch,b);
    sc.close();
  }
 
}

