package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public Main() {
        ImageIcon icon;
        ImageIcon start = new ImageIcon("D:\\openbut.png");
        JLabel Label1;
        JLabel l = new JLabel("HELLLLLO");
        icon = new ImageIcon(this.getClass().getResource("/home.jpg"));
        Label1  = new JLabel(icon);
        Label1.setSize(580,515);
        JFrame frame = new JFrame("IQ Test");
        frame.setSize(580,515);
        JButton b=new JButton();
        b.setBounds(50,435,160,40);
        b.setIcon(start);
        frame.add(l);
        frame.add(b);
        frame.add(Label1);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Started", "Prompt", 1);
                JFrame frame1 = new JFrame("IQ Test - Q1");
                JLabel question;
                question = new JLabel("Questidfgh1");
                question.setForeground(Color.red);
                //question.setAlignmentX(50);
                //question.setAlignmentY(435);
                // ImageIcon q = new ImageIcon("D:\\q.png");
                //JLabel Label2;
                // Label2 = new JLabel(q);
                // Label2.setSize(620,515);
                frame1.setSize(1000,1000);
                //frame1.add(Label2);
                frame1.add(question);
                frame1.setLayout(null);
                frame1.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}

