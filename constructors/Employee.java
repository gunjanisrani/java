package constructors;
import java.util.*;

public class Employee {
  String emp_name;
  int emp_id;
  int dept_id;

  Employee(){
    dept_id=10;
  }

  public void acceptDetails(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    emp_name=sc.nextLine();
    System.out.println("Enter your id");
    emp_id=sc.nextInt();
  }

  public void displayDetails(){
    System.out.println("Name: "+emp_name);
    System.out.println("ID: "+emp_id);
    System.out.println("Dept ID: "+dept_id);

  }

  public static void main(String[] args) {
    Employee emp=new Employee();
    emp.acceptDetails();
    emp.displayDetails();
  }
}
