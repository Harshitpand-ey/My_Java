package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ABC extends JFrame {
    public ABC(){
        JButton b=new JButton("ADD Form");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SwingCalc();

                 dispose();
            }
        });
        add(b);

        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
public class SwingCaller {
    public static void main(String[] args) {
     ABC ab=new ABC();
    }
}
