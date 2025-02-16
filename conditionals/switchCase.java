//Accept the month and year from the user and display the number of days in the month using the Switch case.

package conditionals;
import java.util.Scanner;

public class switchCase {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a year");
    int year=sc.nextInt();
    sc.nextLine();

    System.out.println("Enter a month");
    String month=sc.nextLine();
    month= month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();

    switch(month){
      case "January":
      case "March":
      case "May":
      case "July":
      case "August":
      case "October":
      case "December": System.out.println(month+ " has 31 days");
      break;
      case "April":
      case "June":
      case "September":
      case "November": System.out.println(month+ " has 30 days");
      break;
      case "February": if(year%400==0 || year%4==0 && year%100!=0)
                        System.out.println(month +" has 29 days as it is a leap year");
                       else
                       System.out.println(month +" has 28 days");
      break;
      default: System.out.println("Enter a valid month");
      break;                 
    }
    sc.close();
  }
}
