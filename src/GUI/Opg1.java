package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Opg1 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    // Declare components for the program's window
    public JButton b1, b2, b3;  // Buttons
    public JTextField txtfld1, txtfld2, txtfld3;               // Small text field at the bottom of the window
    public JLabel label1, label2, label3;

    public Opg1() {
        // Set a BorderLayout on the main window
        getContentPane().setLayout(new BorderLayout());

        // Define a standard button size - 100 x 30 pixels
        Dimension btnsize = new Dimension(100, 30);

        // Create a button and set max size and alignment (relative to the surrounding container)
        b1 = new JButton("Convert");
        b1.addActionListener(this);
        b1.setMaximumSize(btnsize);
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Same for the second button
        b2 = new JButton("Convert");
        b2.addActionListener(this);
        b2.setMaximumSize(btnsize);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Same for the clear button
        b3 = new JButton("Convert");
        b3.addActionListener(this);
        b3.setMaximumSize(btnsize);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);


        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
        p1.add(Box.createRigidArea(new Dimension(110, 5)));
        p1.add(b1);
        p1.add(Box.createRigidArea(new Dimension(110, 5)));
        p1.add(b2);
        p1.add(Box.createRigidArea(new Dimension(110, 5)));
        p1.add(b3);

        getContentPane().add(p1, BorderLayout.EAST);

        txtfld1 = new JTextField(20);
        txtfld2 = new JTextField(20);
        txtfld3 = new JTextField(20);


        JPanel p2 = new JPanel();
        p2.add(Box.createRigidArea(new Dimension(110, 30)));
        p2.add(txtfld1);
        p2.add(Box.createRigidArea(new Dimension(110, 30)));
        p2.add(txtfld2);
        p2.add(Box.createRigidArea(new Dimension(110, 30)));
        p2.add(txtfld3);

        getContentPane().add(p2, BorderLayout.CENTER);

        label1 = new JLabel("Binary:");
        label2 = new JLabel("Decimal:");
        label3 = new JLabel("Hexadecimal:");

        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
        p3.add(label1);
        p3.add(Box.createRigidArea(new Dimension(110, 30)));
        p3.add(label2);
        p3.add(Box.createRigidArea(new Dimension(110, 30)));
        p3.add(label3);
        p3.add(Box.createRigidArea(new Dimension(110, 30)));
        getContentPane().add(p3, BorderLayout.WEST);


        // Add the container to the bottom part of the main window
        //getContentPane().add(p2, BorderLayout.SOUTH);
    }

    // actionPerformed method to handle when the user presses any of the buttons
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String s = txtfld1.getText();
            int i = Integer.parseInt(s);

            //Bin to Dec
            int Dint = Integer.parseInt(s,2);
            String D = Integer.toString(Dint);
            txtfld2.setText(D);

            //Bin to Hex
            String H = Integer.toHexString(i);
            txtfld3.setText(H);

        } else if (e.getSource() == b2) {
            String s = txtfld2.getText();
            int i = Integer.parseInt(s);

            // Dec to Bin
            String B = Integer.toBinaryString(i);
            txtfld1.setText(B);

            // Dec to Hex
            String H = Integer.toHexString(i);
            txtfld3.setText(H);

        } else if (e.getSource() == b3) {
            String s = txtfld3.getText();
            int i = Integer.parseInt(s);

            //Hex to Bin
            String B = Integer.toBinaryString(i);
            txtfld1.setText(B);

            //Hex to Dec
            int Dint = Integer.parseInt(s,16);
            String D = Integer.toString(Dint);
            txtfld2.setText(D);
        }
    }

    public static void main(String[] args) {
        Opg1 Opg1 = new Opg1();

        Opg1.setTitle("Opg1"); // Set title on window
        Opg1.setSize(600, 150);     // Set size
        Opg1.setResizable(false);    // Allow the window to be resized
        Opg1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Opg1.setVisible(true);      // Make the window visible
    }
}