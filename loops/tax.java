// A sales tax of 7% is levied on all goods and services consumed. It is also mandatory that all the price tags should include the sales tax. For example, if an item has a price tag of $107, the actual price is $100 and $7 goes to the sales tax. Write a program using a loop to continuously input the tax-inclusive price (in double); compute the actual price and the sales tax (in double); and print the results rounded to 2 decimal places. The program shall terminate in response to input of -1; and print the total price, total actual price, and total sales tax. 

package loops;
import java.util.Scanner;

public class tax {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double taxInclusivePrice;
    double actualPrice;
    double salesTax;

    while (true) {  
      System.out.println("Enter the tax-inclusive price (in decimals) or -1 to exit:");
      taxInclusivePrice = sc.nextDouble();

      if (taxInclusivePrice == -1) {
          System.out.println("Exiting program...");
          break;
      }

      salesTax = taxInclusivePrice * 0.07; // 7% sales tax
      actualPrice = taxInclusivePrice - salesTax;

      System.out.printf("The tax-inclusive price is: %.2f\n", taxInclusivePrice);
      System.out.printf("The sales tax levied is: %.2f\n", salesTax);
      System.out.printf("Thus, the actual price is: %.2f\n", actualPrice);
  }

  sc.close();
  }
  
}
