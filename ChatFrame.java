package chatframe;

import javax.swing.*;
import java.awt.*;

public class ChatFrame {
    public static void main(String[] args){
        // Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        // Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        JMenu m3 = new JMenu("Insert");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        JMenuItem m11 = new JMenuItem("New");
        JMenuItem m22 = new JMenuItem("Open");
        JMenuItem m33 = new JMenuItem("save as");
        m1.add(m11);
        m1.add(m22);
        m1.add(m33);

        // Creating the panel at bottom and adding compoenets
        JPanel panel = new JPanel(); // This panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(15); // accepts upto 15 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Component Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        // Adding Components to the frame
        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        frame.getContentPane().add(BorderLayout.NORTH,mb);
        frame.getContentPane().add(BorderLayout.CENTER,ta);
        frame.setVisible(true);

    }
}
