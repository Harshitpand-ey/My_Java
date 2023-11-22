package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Xyz extends JFrame{
    public Xyz(){
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                int x=e.getX();
                int y=e.getY();
                System.out.println(x+","+y);
            }
        });
        setLayout(new FlowLayout());//FlowLayout GridLayout is null it helps into print the two or more labels or texts;
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class SwingMouseListener {
    public static void main(String[] args) {
     Xyz ob=new Xyz();
    }
}
