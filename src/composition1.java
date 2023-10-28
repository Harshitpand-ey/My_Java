
public class composition1 {
    public static void main(String[] args) {
        ComputerCase theCase=new ComputerCase("2208","Dell","2");//ComputerCase is our method which is present in product.java file;
        Monitor theMonitor=new Monitor("27 inch","hp",27,"2540 X 1440");
        MotherBoard theMotherBoard=new MotherBoard("Bj-200","Asus",4,64,"v2.644");
        personalComputer thePC=new personalComputer("2208","Dell",theCase,theMotherBoard,theMonitor);
//       thePC.getMonitor().drawPixelAt(10,10,"Blue");
//       thePC.getMotherBoard().loadProgram("Window OS ");
//       thePC.getComputerCase().pressButton();
        thePC.powerUp();
    }

}
