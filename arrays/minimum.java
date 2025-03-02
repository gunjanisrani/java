//create a method that accepts an 1D array as a parameter and returns the minimum value in it

package arrays;
import java.util.Scanner;

 public class minimum{
  static int min(int arr[]){
  int min=arr[0];
  for (int i=1;i<arr.length;i++){
  if(min>arr[i]){
    min=arr[i];
    }
  }
  return min;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("Enter 5 numbers in an array");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }

    System.out.println("The minimum element is " + min(arr));
    sc.close();
  }
}
