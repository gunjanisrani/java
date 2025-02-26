//for each loop

package loops;
import java.util.Scanner;

public class forEach {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String[] colors= new String[4];
    System.out.println("Enter any 4 color names");
    for(int i=0;i<4;i++){
      colors[i]=sc.nextLine();
    }

    System.out.println("You have picked: ");
    for(String name:colors){  //for each 
      System.out.println(name);
    }
    sc.close();
  }
}
