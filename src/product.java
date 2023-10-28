public class product{
    private String model;//it is a attribute
    private String manufacturer;//it is a attribute
    private int width;//it is a attribute
    private int depth;//it is a attribute
    private int height;//it is a attribute

    public product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }


}
class Monitor extends product{//means monitor is said to be a type of product;
    private int size;
    private String resolution;
    public Monitor(String model, String manufacturer) {

        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution)//Constructor overloading;
    {
        super(model,manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
    public  void drawPixelAt(int x,int y,String color){
        System.out.println(String.format("drawing pixel at %d,%d  in color %s ",x,y,color));
    }
}
class MotherBoard extends product{//means MotherBoard is said to be a type of product;
   private int ramSlots;
   private int cardSlot;
   private String bios;



    public MotherBoard(String model, String manufacturer)
    {
        super(model, manufacturer);
    }
    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlot, String bios)
    {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }
    public void loadProgram(String ProgramName)
    {
        System.out.println("program  "+ProgramName+" is loading... ");
    }
}
class ComputerCase extends product{//means ComputerCase is said to be a type of product;
    private String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressButton(){
        System.out.println("power button pressed");
    }
}
//use of this is in file personalComputer;