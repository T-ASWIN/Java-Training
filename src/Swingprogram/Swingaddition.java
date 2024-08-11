package Swingprogram;
import javax.swing.*;
import java.awt.*;

public class Swingaddition {
    public static void main(String[] args) {
        JFrame f=new JFrame("Welcome swing");

        JButton b=new JButton("click");
        b.setBounds(300,300,60,40);

        b.setForeground(Color.orange);

        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);

        f.getContentPane().setBackground(Color.GREEN);

        f.setVisible(true);
    }
}
