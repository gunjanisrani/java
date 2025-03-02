//Write a program to accept 10 numbers in a 1 D array. Accept a number from the user and search whether the number is present in the array or not.

package arrays;
import java.util.Scanner;

public class arraySearch {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int[] arr=new int[10];
    System.out.println("Enter 10 elements of the array");

    for(int i=0;i<10;i++){
      arr[i]=sc.nextInt();
    }

    System.out.print("Enter a number to search in the array: ");
    int num=sc.nextInt();
    boolean found=false;

    for(int i=0;i<10;i++){
      if(num==arr[i]){
        found=true;
        break;
      }
    }

    if(found){
      System.out.println(num+" exists in the array");
    }
    else{
      System.out.println(num+
      " does not exist in the array");
    }

    sc.close();
  }  
}
