
package Swingprogram;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingaddtion2 {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Addition Program");

        // Create labels, text fields, and a button
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(30, 50, 80, 60);

        JTextField textField1 = new JTextField();
        textField1.setBounds(120, 50, 150, 30);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(30, 100, 80, 30);

        JTextField textField2 = new JTextField();
        textField2.setBounds(120, 100, 150, 30);

        JButton addButton = new JButton("Add");
        addButton.setBounds(120, 150, 80, 30);

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
                    JOptionPane.showMessageDialog(frame, "The sum is: " + sum);
                } catch (NumberFormatException ex) {
                    // Display an error message if the input is not valid
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add components to the frame
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);

        // Set the size of the frame
        frame.setSize(300, 300);

        // Use null layout manager
        frame.setLayout(null);

        // Make the frame visible
        frame.setVisible(true);

        // Ensure the application exits when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
