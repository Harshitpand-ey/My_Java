package Lab;

import javax.swing.*;
import java.awt.*;

class Registeration extends JFrame{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    JTextArea a1;
    JCheckBox c1,c2;
    JRadioButton r1,r2;



    public Registeration(){
        setTitle("Registeration Form");
         t1=new JTextField(15);
         t2=new JTextField(15);
          c1=new JCheckBox("inJee");
          c2=new JCheckBox("inNEET");
          r1=new JRadioButton("Male");
          r2=new JRadioButton("Female");
          l1=new JLabel();
        l2=new JLabel();
          b1=new JButton("Ok");
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(t1);
      add(t2);
      add(c1);
      add(c2);
      add(r1);
      add(r2);


      add(b1);
        add(l1);
        add(l2);
      t1.addActionListener(ae->{
          String s1=t1.getText();
          String s2=t2.getText();
      });
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
         b1.addActionListener(ae->{
             String name=t1.getText();
             String addre=t2.getText();
             l1.setText(name);
             l2.setText(addre);

         });
    }

}
public class cl38 {
    public static void main(String[] args) {
     Registeration ob=new Registeration();
    }
}
