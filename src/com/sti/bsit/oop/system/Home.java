package com.sti.bsit.oop.system;

import javax.swing.*;

public class Home {
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("School Information System");
        jFrame.setContentPane(new Home().mainPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}