package variables;
import java.util.Scanner;

public class userinput {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter your name"); //inputting string values
    String name= sc.nextLine();
    System.out.println("your name is "+name);


    System.out.println("Enter your age"); //inputting integer values
    int age= sc.nextInt();
    System.out.println("your age is "+age);


    System.out.println("Enter your cgpa"); //inputting double values
    double cgpa= sc.nextDouble();
    System.out.println("your cgpa is "+cgpa);

    sc.close();

  }
}
