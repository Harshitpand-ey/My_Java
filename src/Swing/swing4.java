package Swing;

import javax.swing.*;
import java.awt.*;

public class swing4 {
    public static void main(String[] args) {
        Aditions obj=new Aditions();
    }
}
class Aditions extends JFrame {
    JTextField a,b;
    JButton k;
    JLabel l;
    public Aditions(){
        a=new JTextField(20);
        b=new JTextField(20);//These two text fields are used to take two inputs
        k=new JButton("OK");
        l= new JLabel();//It is used to show the output;
        add(a);
        add(b);
        add(k);
        add(l);

        k.addActionListener(ae->
        {
            int num1=Integer.parseInt(a.getText());
        int num2=Integer.parseInt(b.getText());
        int value=num1+num2;
        l.setText(value+"");
        }
        );
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
