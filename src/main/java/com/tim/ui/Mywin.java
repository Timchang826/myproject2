package com.tim.ui;

import javax.swing.*;
import java.awt.*;

public class Mywin {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(100,100);
        jFrame.setLocation(200,300);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton jButton = new JButton("test");
        jFrame.setLayout(new FlowLayout());
        jFrame.add(jButton);
        MyActionListener listener = new MyActionListener();
        jButton.addActionListener(listener);

       /*
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("hello");
            }
        });
       */

        jFrame.setVisible(true);
        System.out.println("hi");
    }
}
