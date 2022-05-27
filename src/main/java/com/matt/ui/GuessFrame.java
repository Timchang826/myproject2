package com.matt.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JTextField number = new JTextField(8);
    JButton button = new JButton("guess");
    Random random = new Random();
    int x = random.nextInt(100)+1;
    JLabel label = new JLabel("secret is + "+x);
    public GuessFrame(){
        super();
        setSize(400,200);
        setLocation(200,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num>x){
                   label.setText("smaller");
                }else if (num<x){
                    label.setText("bigger");
                }else {
                    label.setText("bingo");
                }

            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }





    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }

}
