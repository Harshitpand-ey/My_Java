//personalComputer is our master object it looking for all methods and parts for the computer
public class personalComputer extends product {
    private ComputerCase computerCase;
    private MotherBoard motherBoard;
    private Monitor monitor;//monitor of type Monitor method which is in product.java file;

    public personalComputer(String model, String manufacturer, ComputerCase computerCase, MotherBoard motherBoard, Monitor monitor) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }
    private void drwaLogo(){
        monitor.drawPixelAt(1200,50,"Yellow");
    }
    public void powerUp(){
        computerCase.pressButton();
        drwaLogo();

    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
}
