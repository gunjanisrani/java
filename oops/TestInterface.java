package oops;
interface Bank{
  float rateOfInterest();
}

class SBI implements Bank{
  public float rateOfInterest(){
    return 9.15f;
  }
}

class PNB implements Bank{
  public float rateOfInterest(){
    return 9.7f;
  }
}
public class TestInterface {
  public static void main(String[] args) {
  Bank b=new SBI();
  System.out.println("ROI is: "+b.rateOfInterest());
  Bank c=new PNB();
  System.out.println("ROI is: "+c.rateOfInterest());
}
}
