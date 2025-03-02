//Accept values in a 3X4 array. Write a program to find the sum of elements in the array.
package arrays;
import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int[][] arr=new int[3][4];
    System.out.println("Enter elements in an 3x4 array");
    for(int i=0;i<3;i++){
      for(int j=0;j<4;j++){
        arr[i][j]=sc.nextInt(); 
      }
    }
    int sum=0;
    for(int i=0;i<3;i++){
      for(int j=0;j<4;j++){
        sum=sum+arr[i][j];
      }
  }
  System.out.println("Sum of all elements is "+sum);
  sc.close();
}
}
