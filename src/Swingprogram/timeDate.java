package Swingprogram;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timeDate {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Current Time Display");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create labels to display the current date and time
        JLabel dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.BOLD, 24));
        dateLabel.setForeground(Color.RED);
        frame.add(dateLabel);

        JLabel timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        timeLabel.setForeground(Color.RED);
        frame.add(timeLabel);

        // Create SimpleDateFormat objects to format the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");

        // Create a timer to update the labels every second
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the current date and time
                Date now = new Date();
                // Format the current date and time and set it to the labels
                dateLabel.setText(dateFormat.format(now));
                timeLabel.setText(timeFormat.format(now));
            }
        });

        // Start the timer
        timer.start();

        // Set the frame visible
        frame.setVisible(true);
    }
}
