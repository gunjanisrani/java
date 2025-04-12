package constructors;

public class Book {
  String title,author;
  int price;

  Book(){
    this.title="";
    this.author="";
    this.price=0;
  }
  Book(String title,String author){
    this.title=title;
    this.author=author;
    System.out.println("Title: "+title+ " Author: "+author);
}
  Book(String title,String author,int price){
   this.title=title;
    this.author=author;
    this.price=price;
    System.out.println("Title: "+title+ " Author: "+author+ " Price: "+price);
}
public static void main(String[] args) {
  Book b1=new Book("Anxious people","Fredrick Backman",499);
  Book b2=new Book();
  b2.author="fredrick backman";
  b2.title="A man called Ove";
  System.out.println("Book 2: " + b2.title + " by " + b2.author);
}
}
