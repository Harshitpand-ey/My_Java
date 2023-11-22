package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ABCF extends JFrame implements ActionListener{
    int i=0;
    JProgressBar p;
    public ABCF(){
        JButton b=new JButton("ADD Form");
         p=new JProgressBar(0,20);//Means 100/20 i.e every intake take 5 seconds;
        int i=0;
        Timer t=new Timer(250,this);//1000ms means 1s and this is method which calling the method actionListener;
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            t.start();
            }
        });
        add(b);
        add(p);
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
       // int i=0;
        if(i==20){
            new SwingCalc();

            dispose();
        }
        i++;
        p.setValue(i);
    }

}
public class SwingProgressBar {
    public static void main(String[] args) {

        ABCF ab=new ABCF();
    }
}
