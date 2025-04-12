import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

public class hi {
  public static void main(String[] args) {
    
  
  JFrame f=new JFrame("My JLabel");
  JLabel l1=new JLabel("This is my label");
  JTextField t1=new JTextField("Enter something");
  f.setSize(900,900);
  l1.setBounds(50,100,150,30);
  t1.setBounds(10,300,350,20);
  f.add(l1);
  f.add(t1);
  f.setLayout(null);
  f.setVisible(true);
  
}
}
