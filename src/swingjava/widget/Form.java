package swingjava.widget;

import javax.swing.*;

public class Form {
    private JFrame frame1;
    private int count;

    public Form() {
        frame1 = new JFrame("Hello");
    }
    public Form(JFrame frame1) {
        this.frame1 = frame1;
    }
    public void initConfig(){
//        frame1.setTitle("Hello");
//        frame1.setLayout(null);
//        frame1.setSize(400,500);
        frame1.setLocation(100,200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);








//        JLabel jLabel = new JLabel();
//        jLabel.setText("LOGIN");
//        jLabel.setBounds(170, 50, 100, 50);
//        frame1.add(jLabel);
//        JButton buttonCal1 = new JButton("Login");
//        buttonCal1.setBounds(130,350,100,50);
//        frame1.add(buttonCal1);
//        JTextField jTextField1 = new JTextField();
//        jTextField1.setBounds(40,160,320,30);
//        frame1.add(jTextField1);
//        JTextField jTextField2 = new JTextField();
//        jTextField2.setBounds(40,220,320,30);
//        frame1.add(jTextField2);

    }
    public void run(){
        frame1.setVisible(true);
    }
}
