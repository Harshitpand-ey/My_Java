package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddSubt extends JFrame implements ActionListener {
    JTextField t1,t2;
    JButton b1,b2;
    JLabel l;
    public AddSubt(){
        t1=new JTextField(15);//No. of inputs;
        t2=new JTextField(15);
        b1=new JButton("Add");
        b2=new JButton("Sub");
        l=new JLabel("Result");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);
       b1.addActionListener(this);
       b2.addActionListener(this);
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Calculation Without Anonymous Class
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int value=0;
        if(ae.getSource()==b1){
            value=num1+num2;
        }
        else{
            value=num1-num2;
        }
        l.setText(value+"");
    }
}
public class SwingCalc2 {
    public static void main(String[] args) {
        AddSubt ob=new AddSubt();
    }
}
