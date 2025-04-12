package oops;
import java.util.*;


class Student {
  String name;
  int rollno;
  long contact;

  public void getDetails(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    name=sc.nextLine();
    System.out.println("Enter rollno");
    rollno=sc.nextInt();
    System.out.println("Enter contactno");
    contact=sc.nextLong();
  }
  public void displayDetails(){
    System.out.println("Name: "+name);
    System.out.println("Rollno: "+rollno);
    System.out.println("Contactno: "+contact);
  }
}

public class marks extends Student{
  Scanner sc=new Scanner(System.in);
  int science,maths, english, history;
  public void getMarks(){
    System.out.println("science marks");
    science=sc.nextInt();
    System.out.println("maths marks");
    maths=sc.nextInt();
    System.out.println("english marks");
    english=sc.nextInt();
    System.out.println("history marks");
    history=sc.nextInt();
  }
  public void displayMarks(){
    System.out.println("Science: "+science);
    System.out.println("Maths: "+maths);
    System.out.println("English: "+english);
    System.out.println("History: "+history);
  }

  public static void main(String[] args) {
    marks s1=new marks();
    s1.getDetails();
    s1.getMarks();
    s1.displayDetails();
    s1.displayMarks();
  }
}

