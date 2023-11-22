package Swing;

import javax.swing.*;
import java.awt.*;//awt stands for abstract window toolkit
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing3 {
    public static void main(String[] args) {
        Additions obj=new Additions();
    }
}
class Additions extends JFrame {
    JTextField a,b;
    JButton k;
    JLabel l;
    public Additions(){
        a=new JTextField(20);
        b=new JTextField(20);//These two text fields are used to take two inputs
        k=new JButton("OK");
        l= new JLabel();//It is used to show the output;
        add(a);
        add(b);
        add(k);
        add(l);
       ActionListener al=new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int num1=Integer.parseInt(a.getText());
               int num2=Integer.parseInt(b.getText());
               int value=num1+num2;
               l.setText(value+"");//Value is integer value but in setText we required a String value so by concating with "" we make integer into string because as we know integer+String=String

           }
       };
       k.addActionListener(al);
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
