public class oopsCalling1 {
    public static void main(String[] args) {
        OOPS1_Car car=new OOPS1_Car();
        car.setManufactures("ferrari");//using that setter method which we apply in OOPS1 to set the value of class;Now the value of manufacturer is changed from tesla to ferrari
        car.setModel("jr");
        car.setColor("golden");
        car.setConvertible(false);
        car.setDoors(4);
        System.out.println("model "+ car.getModel());//here we are getting the class
        System.out.println("manufacturer "+car.getManufactures());//value of manufacturer change here from tesla to ferrari;
        car.describeCar();//value of manufacturer changes here also from tesla to ferrari;
      OOPS1_Car targa=new OOPS1_Car();
        targa.setColor("black");//if there is golden or any other color except those 4 which are in that switch case than it is not supported;
      targa.describeCar();
    }
}
