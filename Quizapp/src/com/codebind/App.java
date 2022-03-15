package com.codebind;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static int score = 0;
    public static String username = "YOUR NAME";
    public App() {
        File file = new File("result.txt");

        ImageIcon icon;
        ImageIcon start = new ImageIcon(this.getClass().getResource("/openbut.png"));
        JLabel Label1;
        JTextField name;
        name = new JTextField();
        name.setBounds(50,400,160,30);
        name.setText("YOUR NAME");
        icon = new ImageIcon(this.getClass().getResource("/home.jpg"));
        Label1  = new JLabel(icon);
        Label1.setSize(580,515);
        JFrame frame = new JFrame("IQ Test");
        frame.setSize(580,515);
        JButton b=new JButton();
        b.setBounds(50,435,160,40);
        b.setIcon(start);
        frame.add(name);
        frame.add(b);
        frame.add(Label1);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                username = name.getText();
                JOptionPane.showMessageDialog(null, "Started", "Prompt", 1);
                JFrame frame1 = new JFrame("IQ Test - Q1");
                JLabel question;
                JRadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7,rb8,rb9,rb10,rb11,rb12 ,rb13,rb14,rb15,rb16,rb17,rb18,rb19,rb20,rb21,rb22,rb23,rb24,rb25,rb26,rb27,rb28,rb29,rb30,rb31,rb32,rb33,rb34,rb35,rb36,rb37,rb38,rb39,rb40;
                rb1 = new JRadioButton("25");rb3 = new JRadioButton("37");rb4 = new JRadioButton("24");rb2 = new JRadioButton("0");
                rb5 = new JRadioButton("HRGST");rb6 = new JRadioButton("RILPA");rb7 = new JRadioButton("TOOMT");rb8 = new JRadioButton("WQRGS");
                rb9 = new JRadioButton("25");rb10 = new JRadioButton("5");rb11 = new JRadioButton("1");rb12 = new JRadioButton("10");
                rb13 = new JRadioButton("1110");rb14 = new JRadioButton("1287");rb15 = new JRadioButton("987");rb16 = new JRadioButton("961");
                rb17 = new JRadioButton("12 meters");rb18 = new JRadioButton("6 meters");rb19 = new JRadioButton("2 meters");rb20 = new JRadioButton("0 meters");
                rb21 = new JRadioButton("4");rb22 = new JRadioButton("2");rb23= new JRadioButton("0");rb24 = new JRadioButton("1");
                rb25 = new JRadioButton("6");rb26 = new JRadioButton("2");rb27 = new JRadioButton("0");rb28 = new JRadioButton("4");
                rb29 = new JRadioButton("69");rb30 = new JRadioButton("90");rb31= new JRadioButton("89");rb32= new JRadioButton("87");
                rb33 = new JRadioButton("264");rb34 = new JRadioButton("132");rb35 = new JRadioButton("144");rb36 = new JRadioButton("12");
                rb37 = new JRadioButton("200");rb38 = new JRadioButton("100");rb39 = new JRadioButton("50");rb40 = new JRadioButton("Cant be divided");
                rb3.setBounds(450, 300, 100, 30);
                rb4.setBounds(450, 400, 100, 30);
                rb1.setBounds(30, 300, 100, 30);
                rb2.setBounds(30, 400, 100, 30);
                rb7.setBounds(450, 300, 100, 30);
                rb8.setBounds(450, 400, 100, 30);
                rb5.setBounds(30, 300, 100, 30);
                rb6.setBounds(30, 400, 100, 30);
                rb11.setBounds(450, 300, 100, 30);
                rb12.setBounds(450, 400, 100, 30);
                rb9.setBounds(30, 300, 100, 30);
                rb10.setBounds(30, 400, 100, 30);
                rb15.setBounds(450, 300, 100, 30);
                rb16.setBounds(450, 400, 100, 30);
                rb13.setBounds(30, 300, 100, 30);
                rb14.setBounds(30, 400, 100, 30);
                rb19.setBounds(450, 300, 100, 30);
                rb20.setBounds(450, 400, 100, 30);
                rb17.setBounds(30, 300, 100, 30);
                rb18.setBounds(30, 400, 100, 30);
                rb23.setBounds(450, 300, 100, 30);
                rb24.setBounds(450, 400, 100, 30);
                rb21.setBounds(30, 300, 100, 30);
                rb22.setBounds(30, 400, 100, 30);
                rb27.setBounds(450, 300, 100, 30);
                rb28.setBounds(450, 400, 100, 30);
                rb25.setBounds(30, 300, 100, 30);
                rb26.setBounds(30, 400, 100, 30);
                rb31.setBounds(450, 300, 100, 30);
                rb32.setBounds(450, 400, 100, 30);
                rb29.setBounds(30, 300, 100, 30);
                rb30.setBounds(30, 400, 100, 30);
                rb35.setBounds(450, 300, 100, 30);
                rb36.setBounds(450, 400, 100, 30);
                rb33.setBounds(30, 300, 100, 30);
                rb34.setBounds(30, 400, 100, 30);
                rb39.setBounds(450, 300, 100, 30);
                rb40.setBounds(450, 400, 100, 30);
                rb37.setBounds(30, 300, 100, 30);
                rb38.setBounds(30, 400, 100, 30);
                rb1.setBackground(Color.pink);rb2.setBackground(Color.pink);rb3.setBackground(Color.pink);rb4.setBackground(Color.pink);
                rb5.setBackground(Color.pink);rb6.setBackground(Color.pink);rb7.setBackground(Color.pink);rb8.setBackground(Color.pink);
                rb9.setBackground(Color.pink);rb10.setBackground(Color.pink);rb11.setBackground(Color.pink);rb12.setBackground(Color.pink);
                rb13.setBackground(Color.pink);rb14.setBackground(Color.pink);rb15.setBackground(Color.pink);rb16.setBackground(Color.pink);
                rb17.setBackground(Color.pink);rb18.setBackground(Color.pink);rb19.setBackground(Color.pink);rb20.setBackground(Color.pink);
                rb21.setBackground(Color.pink);rb22.setBackground(Color.pink);rb23.setBackground(Color.pink);rb24.setBackground(Color.pink);
                rb25.setBackground(Color.pink);rb26.setBackground(Color.pink);rb27.setBackground(Color.pink);rb28.setBackground(Color.pink);
                rb29.setBackground(Color.pink);rb30.setBackground(Color.pink);rb31.setBackground(Color.pink);rb32.setBackground(Color.pink);
                rb33.setBackground(Color.pink);rb34.setBackground(Color.pink);rb35.setBackground(Color.pink);rb36.setBackground(Color.pink);
                rb37.setBackground(Color.pink);rb38.setBackground(Color.pink);rb39.setBackground(Color.pink);rb40.setBackground(Color.pink);
                ButtonGroup bg = new ButtonGroup();ButtonGroup bg2 = new ButtonGroup();ButtonGroup bg3 = new ButtonGroup();ButtonGroup bg4 = new ButtonGroup();
                ButtonGroup bg5 = new ButtonGroup();ButtonGroup bg6 = new ButtonGroup();ButtonGroup bg7 = new ButtonGroup();ButtonGroup bg8 = new ButtonGroup();
                ButtonGroup bg9 = new ButtonGroup();ButtonGroup bg10 = new ButtonGroup();
                bg.add(rb1);bg.add(rb2);bg.add(rb3);bg.add(rb4);
                bg2.add(rb5);bg2.add(rb6);bg2.add(rb7);bg2.add(rb8);
                bg3.add(rb9);bg3.add(rb10);bg3.add(rb11);bg3.add(rb12);
                bg4.add(rb13);bg4.add(rb14);bg4.add(rb15);bg4.add(rb16);
                bg5.add(rb17);bg5.add(rb18);bg5.add(rb19);bg5.add(rb20);
                bg6.add(rb21);bg6.add(rb22);bg6.add(rb23);bg6.add(rb24);
                bg7.add(rb25);bg7.add(rb26);bg7.add(rb27);bg7.add(rb28);
                bg8.add(rb29);bg8.add(rb30);bg8.add(rb31);bg8.add(rb32);
                bg9.add(rb33);bg9.add(rb34);bg9.add(rb35);bg9.add(rb36);
                bg10.add(rb37);bg10.add(rb38);bg10.add(rb39);bg10.add(rb40);
                rb5.setVisible(false);rb6.setVisible(false);rb7.setVisible(false);rb8.setVisible(false);
                rb9.setVisible(false);rb10.setVisible(false);rb11.setVisible(false);rb12.setVisible(false);
                rb13.setVisible(false);rb14.setVisible(false);rb15.setVisible(false);rb16.setVisible(false);
                rb17.setVisible(false);rb18.setVisible(false);rb19.setVisible(false);rb20.setVisible(false);
                rb21.setVisible(false);rb22.setVisible(false);rb23.setVisible(false);rb24.setVisible(false);
                rb25.setVisible(false);rb26.setVisible(false);rb27.setVisible(false);rb28.setVisible(false);
                rb29.setVisible(false);rb30.setVisible(false);rb31.setVisible(false);rb32.setVisible(false);
                rb33.setVisible(false);rb34.setVisible(false);rb35.setVisible(false);rb36.setVisible(false);
                rb37.setVisible(false);rb38.setVisible(false);rb39.setVisible(false);rb40.setVisible(false);


                question = new JLabel("Which number should come next in the pattern?37, 34, 31, 28, _ ");
                question.setFont(new Font("Serif", Font.PLAIN, 18));

                question.setBounds(10, 50, 800, 150);
                ImageIcon q = new ImageIcon(this.getClass().getResource("/q.png"));
                JLabel Label2;
                Label2 = new JLabel(q);
                Label2.setSize(620, 515);
                frame1.setSize(620, 515);
                frame1.add(question);
                frame1.add(rb1);frame1.add(rb2);frame1.add(rb3);frame1.add(rb4);
                frame1.add(rb5);frame1.add(rb6);frame1.add(rb7);frame1.add(rb8);
                frame1.add(rb9);frame1.add(rb10);frame1.add(rb11);frame1.add(rb12);
                frame1.add(rb13);frame1.add(rb14);frame1.add(rb15);frame1.add(rb16);
                frame1.add(rb17);frame1.add(rb18);frame1.add(rb19);frame1.add(rb20);
                frame1.add(rb21);frame1.add(rb22);frame1.add(rb23);frame1.add(rb24);
                frame1.add(rb25);frame1.add(rb26);frame1.add(rb27);frame1.add(rb28);
                frame1.add(rb29);frame1.add(rb30);frame1.add(rb31);frame1.add(rb32);
                frame1.add(rb33);frame1.add(rb34);frame1.add(rb35);frame1.add(rb36);
                frame1.add(rb37);frame1.add(rb38);frame1.add(rb39);frame1.add(rb40);

                frame1.add(Label2);
                frame1.setLayout(null);
                frame1.setVisible(true);

                rb1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 25", "Prompt", 1);
                        question.setText("Which of the following can be arranged into a 5-letter English word?");
                        score += 10;
                        rb1.setVisible(false);
                        rb2.setVisible(false);
                        rb3.setVisible(false);
                        rb4.setVisible(false);
                        rb5.setVisible(true);
                        rb6.setVisible(true);
                        rb7.setVisible(true);
                        rb8.setVisible(true);


                    }

                });
                rb2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 25", "Prompt", 1);
                        question.setText("Which of the following can be arranged into a 5-letter English word?");
                        rb1.setVisible(false);
                        rb2.setVisible(false);
                        rb3.setVisible(false);
                        rb4.setVisible(false);
                        rb5.setVisible(true);
                        rb6.setVisible(true);
                        rb7.setVisible(true);
                        rb8.setVisible(true);

                    }

                });
                rb3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 25", "Prompt", 1);
                        question.setText("Which of the following can be arranged into a 5-letter English word?");
                        rb1.setVisible(false);
                        rb2.setVisible(false);
                        rb3.setVisible(false);
                        rb4.setVisible(false);
                        rb5.setVisible(true);
                        rb6.setVisible(true);
                        rb7.setVisible(true);
                        rb8.setVisible(true);

                    }

                });

                rb4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 25", "Prompt", 1);
                        question.setText("Which of the following can be arranged into a 5-letter English word?");
                        rb1.setVisible(false);
                        rb2.setVisible(false);
                        rb3.setVisible(false);
                        rb4.setVisible(false);
                        rb5.setVisible(true);
                        rb6.setVisible(true);
                        rb7.setVisible(true);
                        rb8.setVisible(true);
                    }

                });

                rb5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is Toomt", "Prompt", 1);
                        question.setText("What number is one quarter of one tenth of one fifth of 200?");
                        rb5.setVisible(false);
                        rb6.setVisible(false);
                        rb7.setVisible(false);
                        rb8.setVisible(false);
                        rb9.setVisible(true);
                        rb10.setVisible(true);
                        rb11.setVisible(true);
                        rb12.setVisible(true);


                    }

                });
                rb6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is Toomt", "Prompt", 1);
                        question.setText("What number is one quarter of one tenth of one fifth of 200?");
                        rb5.setVisible(false);
                        rb6.setVisible(false);
                        rb7.setVisible(false);
                        rb8.setVisible(false);
                        rb9.setVisible(true);
                        rb10.setVisible(true);
                        rb11.setVisible(true);


                        rb12.setVisible(true);

                    }

                });
                rb7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is Toomt", "Prompt", 1);
                        question.setText("What number is one quarter of one tenth of one fifth of 200?");
                        score += 10;
                        rb5.setVisible(false);
                        rb6.setVisible(false);
                        rb7.setVisible(false);
                        rb8.setVisible(false);
                        rb9.setVisible(true);
                        rb10.setVisible(true);
                        rb11.setVisible(true);
                        rb12.setVisible(true);

                    }

                });

                rb8.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is Toomt", "Prompt", 1);
                        question.setText("What number is one quarter of one tenth of one fifth of 200?");
                        rb5.setVisible(false);
                        rb6.setVisible(false);
                        rb7.setVisible(false);
                        rb8.setVisible(false);
                        rb9.setVisible(true);
                        rb10.setVisible(true);
                        rb11.setVisible(true);
                        rb12.setVisible(true);
                    }

                });
                rb9.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 1", "Prompt", 1);
                        question.setText("144, 233, 377, 610,_, 1597, 2584.What is the missing number?");
                        rb9.setVisible(false);
                        rb10.setVisible(false);
                        rb11.setVisible(false);
                        rb12.setVisible(false);
                        rb13.setVisible(true);
                        rb14.setVisible(true);
                        rb15.setVisible(true);
                        rb16.setVisible(true);


                    }

                });
                rb10.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 1", "Prompt", 1);
                        question.setText("144, 233, 377, 610,_, 1597, 2584.What is the missing number?");
                        rb9.setVisible(false);
                        rb10.setVisible(false);
                        rb11.setVisible(false);
                        rb12.setVisible(false);
                        rb13.setVisible(true);
                        rb14.setVisible(true);
                        rb15.setVisible(true);
                        rb16.setVisible(true);

                    }

                });
                rb11.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 1", "Prompt", 1);
                        question.setText("144, 233, 377, 610,_, 1597, 2584.What is the missing number?");
                        score += 10;
                        rb9.setVisible(false);
                        rb10.setVisible(false);
                        rb11.setVisible(false);
                        rb12.setVisible(false);
                        rb13.setVisible(true);
                        rb14.setVisible(true);
                        rb15.setVisible(true);
                        rb16.setVisible(true);

                }

            });

                rb12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Answer is 1", "Prompt", 1);
                    question.setText("144, 233, 377, 610,_, 1597, 2584.What is the missing number?");
                    rb9.setVisible(false);
                    rb10.setVisible(false);
                    rb11.setVisible(false);
                    rb12.setVisible(false);
                    rb13.setVisible(true);
                    rb14.setVisible(true);
                    rb15.setVisible(true);
                    rb16.setVisible(true);
                }

                });
                rb13.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 967", "Prompt", 1);
                        question.setText("2 ppl at same point move opposite for 2m,left 3m & left 2m.length b/w them?");
                        rb13.setVisible(false);
                        rb14.setVisible(false);
                        rb15.setVisible(false);
                        rb16.setVisible(false);
                        rb17.setVisible(true);
                        rb18.setVisible(true);
                        rb19.setVisible(true);
                        rb20.setVisible(true);


                    }

                });
                rb14.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 967", "Prompt", 1);
                        question.setText("2 ppl at same point move opposite for 2m,left 3m & left 2m.length b/w them?");
                        rb13.setVisible(false);
                        rb14.setVisible(false);
                        rb15.setVisible(false);
                        rb16.setVisible(false);
                        rb17.setVisible(true);
                        rb18.setVisible(true);
                        rb19.setVisible(true);
                        rb20.setVisible(true);

                    }

                });
                rb15.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 967", "Prompt", 1);
                        question.setText("2 ppl at same point move opposite for 2m,left 3m & left 2m.length b/w them?");
                        score += 10;
                        rb13.setVisible(false);
                        rb14.setVisible(false);
                        rb15.setVisible(false);
                        rb16.setVisible(false);
                        rb17.setVisible(true);
                        rb18.setVisible(true);
                        rb19.setVisible(true);
                        rb20.setVisible(true);

                    }

                });

                rb16.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 967", "Prompt", 1);
                        question.setText("2 ppl at same point move opposite for 2m,left 3m & left 2m.length b/w them?");
                        rb13.setVisible(false);
                        rb14.setVisible(false);
                        rb15.setVisible(false);
                        rb16.setVisible(false);
                        rb17.setVisible(true);
                        rb18.setVisible(true);
                        rb19.setVisible(true);
                        rb20.setVisible(true);
                    }

                });
                rb17.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 6 meters", "Prompt", 1);
                        question.setText("2 lions and 2 tigers in a zoo,2 lions are shot,how many animals in the zoo?");
                        rb17.setVisible(false);
                        rb18.setVisible(false);
                        rb19.setVisible(false);
                        rb20.setVisible(false);
                        rb21.setVisible(true);
                        rb22.setVisible(true);
                        rb23.setVisible(true);
                        rb24.setVisible(true);


                    }

                });
                rb18.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 6 meters", "Prompt", 1);
                        question.setText("2 lions and 2 tigers in a zoo,2 lions are shot,how many animals in the zoo?");
                        score += 10;
                        rb17.setVisible(false);
                        rb18.setVisible(false);
                        rb19.setVisible(false);
                        rb20.setVisible(false);
                        rb21.setVisible(true);
                        rb22.setVisible(true);
                        rb23.setVisible(true);
                        rb24.setVisible(true);

                    }

                });
                rb19.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 6 meters", "Prompt", 1);
                        question.setText("2 lions and 2 tigers in a zoo,2 lions are shot,how many animals in the zoo?");
                        rb17.setVisible(false);
                        rb18.setVisible(false);
                        rb19.setVisible(false);
                        rb20.setVisible(false);
                        rb21.setVisible(true);
                        rb22.setVisible(true);
                        rb23.setVisible(true);
                        rb24.setVisible(true);

                    }

                });

                rb20.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 6 meters", "Prompt", 1);
                        question.setText("2 lions and 2 tigers in a zoo,2 lions are shot,how many animals in the zoo?");
                        rb17.setVisible(false);
                        rb18.setVisible(false);
                        rb19.setVisible(false);
                        rb20.setVisible(false);
                        rb21.setVisible(true);
                        rb22.setVisible(true);
                        rb23.setVisible(true);
                        rb24.setVisible(true);
                    }

                });
                rb21.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 2", "Prompt", 1);
                        question.setText("There are 6 apples,you take away 4, how many do you have??");
                        score += 10;
                        rb21.setVisible(false);
                        rb22.setVisible(false);
                        rb23.setVisible(false);
                        rb24.setVisible(false);
                        rb25.setVisible(true);
                        rb26.setVisible(true);
                        rb27.setVisible(true);
                        rb28.setVisible(true);


                    }

                });
                rb22.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 2", "Prompt", 1);
                        question.setText("There are 6 apples,you take away 4, how many do you have??");
                        rb21.setVisible(false);
                        rb22.setVisible(false);
                        rb23.setVisible(false);
                        rb24.setVisible(false);
                        rb25.setVisible(true);
                        rb26.setVisible(true);
                        rb27.setVisible(true);
                        rb28.setVisible(true);

                    }

                });
                rb23.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 2", "Prompt", 1);
                        question.setText("There are 6 apples,you take away 4, how many do you have??");
                        rb21.setVisible(false);
                        rb22.setVisible(false);
                        rb23.setVisible(false);
                        rb24.setVisible(false);
                        rb25.setVisible(true);
                        rb26.setVisible(true);
                        rb27.setVisible(true);
                        rb28.setVisible(true);

                    }

                });

                rb24.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 2", "Prompt", 1);
                        question.setText("There are 6 apples,you take away 4, how many do you have??");
                        rb21.setVisible(false);
                        rb22.setVisible(false);
                        rb23.setVisible(false);
                        rb24.setVisible(false);
                        rb25.setVisible(true);
                        rb26.setVisible(true);
                        rb27.setVisible(true);
                        rb28.setVisible(true);
                    }

                });
                rb25.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 4", "Prompt", 1);
                        question.setText("find the missing, 16,06,68,88,_,98");
                        rb25.setVisible(false);
                        rb26.setVisible(false);
                        rb27.setVisible(false);
                        rb28.setVisible(false);
                        rb29.setVisible(true);
                        rb30.setVisible(true);
                        rb31.setVisible(true);
                        rb32.setVisible(true);


                    }

                });
                rb26.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 4", "Prompt", 1);
                        question.setText("find the missing, 16,06,68,88,_,98");
                        rb25.setVisible(false);
                        rb26.setVisible(false);
                        rb27.setVisible(false);
                        rb28.setVisible(false);
                        rb29.setVisible(true);
                        rb30.setVisible(true);
                        rb31.setVisible(true);
                        rb32.setVisible(true);

                    }

                });
                rb27.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 4", "Prompt", 1);
                        question.setText("find the missing, 16,06,68,88,_,98");
                        rb25.setVisible(false);
                        rb26.setVisible(false);
                        rb27.setVisible(false);
                        rb28.setVisible(false);
                        rb29.setVisible(true);
                        rb30.setVisible(true);
                        rb31.setVisible(true);
                        rb32.setVisible(true);

                    }

                });

                rb28.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 4", "Prompt", 1);
                        question.setText("find the missing, 16,06,68,88,_,98");
                        score += 10;
                        rb25.setVisible(false);
                        rb26.setVisible(false);
                        rb27.setVisible(false);
                        rb28.setVisible(false);
                        rb29.setVisible(true);
                        rb30.setVisible(true);
                        rb31.setVisible(true);
                        rb32.setVisible(true);
                    }

                });
                rb29.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 87", "Prompt", 1);
                        question.setText("12 ppl handshook with each other before&after meeting.total No. of handshakes?");
                        rb29.setVisible(false);
                        rb30.setVisible(false);
                        rb31.setVisible(false);
                        rb32.setVisible(false);
                        rb33.setVisible(true);
                        rb34.setVisible(true);
                        rb35.setVisible(true);
                        rb36.setVisible(true);


                    }

                });
                rb30.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 87", "Prompt", 1);
                        question.setText("12 ppl handshook with each other before&after meeting.total No. of handshakes?");
                        rb29.setVisible(false);
                        rb30.setVisible(false);
                        rb31.setVisible(false);
                        rb32.setVisible(false);
                        rb33.setVisible(true);
                        rb34.setVisible(true);
                        rb35.setVisible(true);
                        rb36.setVisible(true);

                    }

                });
                rb31.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 87", "Prompt", 1);
                        question.setText("12 ppl handshook with each other before&after meeting.total No. of handshakes?");
                        rb29.setVisible(false);
                        rb30.setVisible(false);
                        rb31.setVisible(false);
                        rb32.setVisible(false);
                        rb33.setVisible(true);
                        rb34.setVisible(true);
                        rb35.setVisible(true);
                        rb36.setVisible(true);

                    }

                });

                rb32.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 87", "Prompt", 1);
                        question.setText("12 ppl handshook with each other before&after meeting.total No. of handshakes?");
                        score += 10;
                        rb29.setVisible(false);
                        rb30.setVisible(false);
                        rb31.setVisible(false);
                        rb32.setVisible(false);
                        rb33.setVisible(true);
                        rb34.setVisible(true);
                        rb35.setVisible(true);
                        rb36.setVisible(true);
                    }

                });
                rb33.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 132", "Prompt", 1);
                        question.setText("If you divide a hundred by half, what is the answer?");
                        rb33.setVisible(false);
                        rb34.setVisible(false);
                        rb35.setVisible(false);
                        rb36.setVisible(false);
                        rb37.setVisible(true);
                        rb38.setVisible(true);
                        rb39.setVisible(true);
                        rb40.setVisible(true);


                    }

                });
                rb34.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 132", "Prompt", 1);
                        question.setText("If you divide a hundred by half, what is the answer?");
                        score += 10;
                        rb33.setVisible(false);
                        rb34.setVisible(false);
                        rb35.setVisible(false);
                        rb36.setVisible(false);
                        rb37.setVisible(true);
                        rb38.setVisible(true);
                        rb39.setVisible(true);
                        rb40.setVisible(true);

                    }

                });
                rb35.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 132", "Prompt", 1);
                        question.setText("If you divide a hundred by half, what is the answer?");
                        rb33.setVisible(false);
                        rb34.setVisible(false);
                        rb35.setVisible(false);
                        rb36.setVisible(false);
                        rb37.setVisible(true);
                        rb38.setVisible(true);
                        rb39.setVisible(true);
                        rb40.setVisible(true);

                    }

                });

                rb36.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 132", "Prompt", 1);
                        question.setText("If you divide a hundred by half, what is the answer?");
                        rb33.setVisible(false);
                        rb34.setVisible(false);
                        rb35.setVisible(false);
                        rb36.setVisible(false);
                        rb37.setVisible(true);
                        rb38.setVisible(true);
                        rb39.setVisible(true);
                        rb40.setVisible(true);
                    }

                });
                rb37.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 200", "Prompt", 1);
                        question.setText("Completed");
                        score += 10;
                        rb37.setVisible(false);
                        rb38.setVisible(false);
                        rb39.setVisible(false);
                        rb40.setVisible(false);
                        JOptionPane.showMessageDialog(null, score, "Result score", 1);
                        try{BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                            bw.write(username + " " + score + "\n");
                            Scanner scan = new Scanner(file);
                            while (scan.hasNextLine()){
                            System.out.println(scan.nextLine());}

                            bw.close();
                        }
                        catch(Exception ex){return;}



                    }

                });
                rb38.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 200", "Prompt", 1);
                        question.setText("Completed");
                        rb37.setVisible(false);
                        rb38.setVisible(false);
                        rb39.setVisible(false);
                        rb40.setVisible(false);
                        JOptionPane.showMessageDialog(null, score, "Result score", 1);
                        try{BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                            bw.write(username + " " + score + "\n");
                            Scanner scan = new Scanner(file);
                            while (scan.hasNextLine()){
                                System.out.println(scan.nextLine());}

                            bw.close();
                        }
                        catch(Exception ex){return;}

                    }

                });
                rb39.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 200", "Prompt", 1);
                        question.setText("Completed");
                        rb37.setVisible(false);
                        rb38.setVisible(false);
                        rb39.setVisible(false);
                        rb40.setVisible(false);
                        JOptionPane.showMessageDialog(null, score, "Result score", 1);
                        try{BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                            bw.write(username + " " + score + "\n");
                            Scanner scan = new Scanner(file);
                            while (scan.hasNextLine()){
                                System.out.println(scan.nextLine());}

                            bw.close();
                        }
                        catch(Exception ex){return;}


                    }

                });


                rb40.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Answer is 200", "Prompt", 1);
                        question.setText("Completed");
                        rb37.setVisible(false);
                        rb38.setVisible(false);
                        rb39.setVisible(false);
                        rb40.setVisible(false);
                        JOptionPane.showMessageDialog(null, username + " " +"score" + ": "+score, "Result score", 1);
                        try{BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                            bw.write(username + " " + score + "\n");
                            Scanner scan = new Scanner(file);
                            String s;
                            while (scan.hasNextLine()){
                                System.out.println(scan.nextLine());}

                            bw.close();
                        }
                        catch(Exception ex){return;}

                    }

                });





            }

        });

    }



    public static void main(String[] args) {
        new App();
    }
}
