
import javax.swing.*;

// Define the main class
class TextFieldExample {

  // Main method - program execution starts here
  public static void main(String args[]) {

    // Create a new frame with a title
    JFrame f = new JFrame("TextField Example");

    // Declare JTextField variables
    JTextField t1, t2;

    // Initialize the first text field with default text
    t1 = new JTextField("Welcome to Javatpoint.");
    // Set its position (x, y) and size (width, height)
    t1.setBounds(50, 100, 200, 30);

    // Initialize the second text field
    t2 = new JTextField("AWT Tutorial");
    // Set its position and size
    t2.setBounds(50, 150, 200, 30);

    // Add both text fields to the frame
    f.add(t1);
    f.add(t2);

    // Set frame size (width x height)
    f.setSize(400, 400);

    // Use null layout so we can manually position components
    f.setLayout(null);

    // Make the frame visible
    f.setVisible(true);
  }
}

