package Swing;

import javax.swing.*;

public class SwingDemo2 {
    public static void main(String[] args) {
        ABD obj=new ABD();
    }
}
class ABD extends JFrame{//JFrame follows card layout means whatever in the last in add means the last one whathever we write to print will be come else will be overidden
    public ABD(){
        JLabel l=new JLabel("Hello World");
        add(l);
        JLabel p=new JLabel("Pandey is here");
        add(p);
        add(l);
        setVisible(true);
        setSize(400,400);
    }
}
