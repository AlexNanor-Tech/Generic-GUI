//Grpahical User Interface
//GUI Class is our GUI Object
// https://www.youtube.com/watch?v=5o3fMLPY7qY: Alex Lee's Tutorial
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI implements ActionListener {

    //State:
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;


    //Behaviour:

    //Constructor
    public GUI(){

        //Step 1: Create resizeable region
         frame = new JFrame();
        //Step 2: Create internal portion.
         panel = new JPanel();
        //To use an object of the Java swing class. Type the objects name, with a dot, and then the method or variable
        //you'd like to access
        JButton button = new JButton("Push Here"); // If we want our button to count clicks.
        button.addActionListener(this);
        //One must configure button to count click events.
        label = new JLabel("Number of clicks: 0");
        //Use panel to setup border, frame, and layout.
        //border is in units of pixels.
        //Pass a borderfactory to setBorder method of panel object (instance of JPanel Class of JSwing Library)
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        // layout to match what was in the borders
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);


        //Contraints:
        frame.add(panel, BorderLayout.CENTER); // Add Panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set what happens when we close the frame
        frame.setTitle("My GUI"); //Set title of window. Outer window containing titel bar.
        frame.pack(); // Set window to match a certain size
        frame.setVisible(true); // Set the window to be visible and in-focus



        // Generates window without button/label



    }


    public static void main(String[] args) {
        //Swing is how we make GUIs in Java
        //Setup:
        new GUI(); // Call our GUI constructor which will set parameters (i.e. do the stuff inside the curly braces)

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks " + count);
    }
}
