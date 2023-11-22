package Swing;
//import javax.swing.JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;

class RadioDemo extends JFrame{
    JTextField t1;
    JButton b1;
    JRadioButton R1,R2;
    JLabel l;
    JCheckBox c1,c2;
    public RadioDemo(){
      t1=new JTextField(15);
      b1=new JButton("OK");
      R1=new JRadioButton("Male");
      R2=new JRadioButton("Female");
      l=new JLabel("Greetings");
      c1=new JCheckBox("Dancing");
      c2=new JCheckBox("Singing");
      add(t1);
      add(R1);
      add(R2);
      add(c1);
      add(c2);
      add(b1);
      add(l);
      c1.addItemListener(new ItemListener() {//It does whenever we press c1 method will be printed on our console
          @Override
          public void itemStateChanged(ItemEvent e) {
              System.out.println("Dancer");
              System.out.println("Singing");
          }
      });
      //This Button group is made to implement the property of Radio button means select only one at a moment;
      ButtonGroup bg=new ButtonGroup();
      bg.add(R1);
      bg.add(R2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             String name=t1.getText();
             if(R1.isSelected()){
                 name="Mr."+name;
             }
             else{
                 name="Mrs."+name;
             }
             if(c1.isSelected()){
                 name=name+" dancer";
             }
             //No else if because user may select both
              if(c2.isSelected()){
                 name=name+" singer";
             }
             l.setText(name);
            }
        });
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class JRadioButtons  {
    public static void main(String[] args) {

        RadioDemo ob=new RadioDemo();
    }
}
