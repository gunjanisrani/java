//check whether given number is palindrome.

package loops;
import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num;
    int reverse=0;
    int lastDig;

    System.out.print("Enter a number: ");
    num=sc.nextInt();
    int original=num;

    while(num>0){
      lastDig= num%10;
      reverse=reverse*10 + lastDig;
      num= num/10;
    }

    if(original==reverse){
      System.out.println(original+ " is a palindrome");
    }
    else{
      System.out.println(original+ " is not a palindrome");
    }

    sc.close();
  }
}
