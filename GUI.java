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

        
         frame = new JFrame();
       
         panel = new JPanel();
     
        JButton button = new JButton("Push Here"); 
        button.addActionListener(this);
       
        label = new JLabel("Number of clicks: 0");
       
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
       
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);


        //Contraints:
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setTitle("My GUI");
        frame.pack(); 
        frame.setVisible(true); 



  



    }


    public static void main(String[] args) {
       
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks " + count);
    }
}
