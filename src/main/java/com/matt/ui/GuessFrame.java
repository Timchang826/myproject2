package com.matt.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    public GuessFrame(){
        super();
        setSize(400,200);
        setLocation(200,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("hi");
        JLabel label = new JLabel("hello");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("hahaha");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setVisible(true);
    }





    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }

}
