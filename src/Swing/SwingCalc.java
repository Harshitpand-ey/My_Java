package Swing;

import javax.swing.*;
import java.awt.*;

class AddSubMulDiv extends JFrame{
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    JLabel l;
    public AddSubMulDiv(){
       t1=new JTextField(15);//No. of inputs;
        t2=new JTextField(15);
        b1=new JButton("Add");
        b2=new JButton("Sub");
        b3=new JButton("Mul");
        b4=new JButton("Div");
        l=new JLabel("Result");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l);
        //Calculator by the anonymous class
        b1.addActionListener(ae->
        {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int value=num1+num2;
            l.setText(value+"");
        });
        b2.addActionListener(ae->{
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int value=num1-num2;
            l.setText(value+"");
        });
        b3.addActionListener(ae->{
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int value=num1*num2;
            l.setText(value+"");
        });
        b4.addActionListener(ae->{
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int value=num1/num2;
            l.setText(value+"");
        });
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class SwingCalc {
    public static void main(String[] args) {

        AddSubMulDiv ob=new AddSubMulDiv();
    }
}
