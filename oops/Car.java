/* )Create a class named Car. Instance variables: make, model, year, color, speed. Method to initialize the car's basic information.
Methods:
accelerate(): Increases the speed by 10.
brake(): Decreases the speed by 10 (don't let it go below 0).
getSpeed(): Returns the current speed.
displayCarInfo(): Prints all the car's information (make, model, year, color, speed).
In Main, create Car objects, accelerate and brake them, and display their information.*/

package oops;

public class Car {
  String make;
  String model;
  int year;
  String color;
  int speed;

  public Car(String make,String model,int year,String color,int speed){
    this.make=make;
    this.model=model;
    this.year=year;
    this.color=color;
    this.speed=speed;
  }

  public void accelerate(){
    this.speed += 10;
    System.out.println("The speed after accelerating is " + this.speed);
  }


  public void brake(){
    if(this.speed <= 10){
        this.speed = 0;
        System.out.println("Applying brakes.. car has stopped");
    } else {
        this.speed -= 10;
        System.out.println("After applying brake, the speed now is " + this.speed);
    }
  }


  public int getSpeed(){
    return this.speed;
  }


  public void displayCarDetails(){
    System.out.println("Car Information:");
    System.out.println("Make: " + this.make);
    System.out.println("Model: " + this.model);
    System.out.println("Year: " + this.year);
    System.out.println("Color: " + this.color);
    System.out.println("Speed: " + this.speed + " km/h");
  }


  public static void main(String[] args) {
    Car car1 = new Car("Toyota", "Camry", 2022, "Red",120);

    car1.accelerate();
    car1.brake();
    car1.displayCarDetails();
  }
}
  

