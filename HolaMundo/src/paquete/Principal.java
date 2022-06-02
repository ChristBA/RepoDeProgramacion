package paquete;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.add(label);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
