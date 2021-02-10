package gui.view;

import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {
    private Panel panel;

    public Frame() {
        panel = new Panel();
        this.setTitle("Task 8");
        this.setSize(650,450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setContentPane(panel);
        ImageIcon image = new ImageIcon("src/resources/images/ZBiNjU2Aoio.jpg");
        this.setIconImage(image.getImage());
    }
}