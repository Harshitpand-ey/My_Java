package Swing;

import javax.swing.*;
import java.awt.*;//awt stands for abstract window toolkit
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingAdd2Num {
    public static void main(String[] args) {
Addition obj=new Addition();
    }
}
class Addition extends JFrame implements ActionListener {
    JTextField a,b;
    JButton k;
    JLabel l;
    public Addition(){
         a=new JTextField(20);
         b=new JTextField(20);//These two text fields are used to take two inputs
         k=new JButton("OK");
         l= new JLabel();//It is used to show the output;
        add(a);
        add(b);
        add(k);
        add(l);
        k.addActionListener(this);//ActionListener is an interface not a class;
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
     int num1=Integer.parseInt(a.getText());
     int num2=Integer.parseInt(b.getText());
     int value=num1+num2;
     l.setText(value+"");//Value is integer value but in setText we required a String value so by concating with "" we make integer into string because as we know integer+String=String
   //  int value1=num1/num2;
     //l.setText(value1+"");
    }
}
