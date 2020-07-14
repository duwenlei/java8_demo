package com.hiooih.stream;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author duwenlei
 **/
public class MinMaxDistinct {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Frame");

        JButton jButton = new JButton("Button");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click button");
            }
        });

        jFrame.add(jButton);
        jFrame.setVisible(true);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Arrays.asList("1","1","1","1","1","1").forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });
    }
}
