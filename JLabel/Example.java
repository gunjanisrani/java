import javax.swing.*;
import java.awt.*;
public class Example {
  public static void main(String[] args) {
    JFrame frame = new JFrame("JLabel Demo");
    frame.setSize(300, 200);
    JLabel label = new JLabel("Hello, Java!");
    frame.add(label);
    frame.setVisible(true);
  }
}


