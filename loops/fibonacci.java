//display n terms of the Fibonacci series.

package loops;
import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter number of terms to be displayed of the fibonacci series: ");
    int n=sc.nextInt();
    int first=0;
    int second=1;
    
    if(n>=1){
      System.out.print(first+" ");
    }
    if(n>=2){
      System.out.print(second+" ");
      }
    
    for(int i=3;i<=n;i++){

      int next=first+second;
      System.out.print(next +" ");
      
      first=second;
      second=next;
    }

  sc.close();
  }
}
