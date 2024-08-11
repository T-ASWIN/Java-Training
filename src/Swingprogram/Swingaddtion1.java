package Swingprogram;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swingaddtion1 {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame f = new JFrame("Addition Program");

        // Create labels, text fields, and a button
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(30, 50, 80, 30);

        JTextField textField1 = new JTextField();
        textField1.setBounds(120, 50, 150, 30);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(30, 100, 80, 30);

        JTextField textField2 = new JTextField();
        textField2.setBounds(120, 100, 150, 30);

        JButton addButton = new JButton("Add");
        addButton.setBounds(120, 150, 80, 30);
        addButton.setBackground(Color.YELLOW);
        addButton.setForeground(Color.BLUE);

        // Add an ActionListener to the button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the input numbers
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());

                    // Calculate the sum
                    int sum = num1 + num2;

                    // Display the sum in a message dialog
                    JOptionPane.showMessageDialog(f, "The sum is: " + sum);
                } catch (NumberFormatException ex) {
                    // Display an error message if the input is not valid
                    JOptionPane.showMessageDialog(f, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add components to the frame
        f.add(label1);
        f.add(textField1);
        f.add(label2);
        f.add(textField2);
        f.add(addButton);

        // Set the size of the frame
        f.setSize(300, 300);

        // Use null layout manager
        f.setLayout(null);

        // Change the background color of the frame's content pane
        f.getContentPane().setBackground(Color.GREEN);

        // Make the frame visible
        f.setVisible(true);

        // Ensure the application exits when the frame is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

