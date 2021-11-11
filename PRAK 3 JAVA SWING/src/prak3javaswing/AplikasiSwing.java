package prak3javaswing;

/**
 *
 * @author ronaldo
 */

import javax.swing.*;
import java.awt.event.*;

public abstract class AplikasiSwing implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public static void createAndShowGUI() {
        // make frame ...
        JFrame frame = new JFrame("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.getContentPane().setLayout(null);
        //make a button
        JButton butt=new JButton("Click me");
        frame.getContentPane().add(butt);
        butt.setBounds(20, 20, 200,20);
        
        
        //instantiate an application object
        AplikasiSwing app = new AplikasiSwing() {};
        //make the label
        app.label = new JLabel("nama saya merupakan");
        app.label.setBounds(20,40, 200,20);
        frame.getContentPane().add(app.label);
        
        //set the application object to be the thing which
        //listens to the button
        butt.addActionListener(app);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
            // Ini akan dieksekusi ketika button diklik
           // clickCount++;
           label.setText("Ronaldo Jago Gaming");
    }
    
      public static void main(String[] args) {
            //Memulai Swing GUI
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        }

        // application object fields
        // int clickCount=0
        JLabel label;
}
