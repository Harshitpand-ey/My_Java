package Swing;

import javax.swing.*;
import java.awt.*;

public class SwingDemo3 {
    public static void main(String[] args) {
ABE ob=new ABE();
    }
}
class ABE extends JFrame {//JFrame follows card layout means whatever in the last in add means the last one whathever we write to print will be come else will be overidden
    public ABE(){
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        JLabel l=new JLabel("Hello World");
        add(l);
        JLabel p=new JLabel("Pandey is here");
        add(p);
        JLabel q=new JLabel("Harshit is here");
        add(q);
        //From line 19-22 is same in every Swing code;
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//We can also write 3 in place of JFrame.EXIT_ON_CLOSE
    }
}

