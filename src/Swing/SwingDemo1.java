package Swing;

import javax.swing.*;

public class SwingDemo1 {
    public static void main(String[] args) {
     ABCD obj=new ABCD();
     obj.setVisible(true);//Because JFrame is by default invisible so to make it visible we use this method and make it true;
     obj.setSize(400,400);//By making this we get a square frame of 400X400;
    }
}
class ABCD extends JFrame{
public ABCD(){

}
}
