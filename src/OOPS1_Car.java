public class OOPS1_Car {//here blueprint is OOPS1_Car
    private String manufactures="Tesla";
    private String model="XR";
    private String color="Yellow";
    private   int  Doors=2;
    private boolean convertible=true;// these are private to encapsulate the class;
    //Now lets create template of our car;

//Now we using getter to retrieve the values of private field
    public String getManufactures() {
        return manufactures;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return Doors;
    }

    public boolean getConvertible() {
        return convertible;//or true instead of convertible is also fine;
    }

    public String getModel(){
        return model;
    }
    //Now we create all setters below;
    public void setManufactures(String manufactures){//setter is doing here .that's a way of updating the manufactures attributes on the car,using a method ,instead of trying it to access directly;
       this.manufactures=manufactures;//this. is a keyword
        //with the help of this setter we set the any value of manufacturer in the method calling instead it is private;
    }

    public void setColor(String color) {
        //this.color = color;
        if(color==null) color="Unknown";
        String lowerCaseColor=color.toLowerCase();
        switch (lowerCaseColor){
            case "Yellow","black","white","pink"->this.color=color;//except this 4 color we cannot set any color(any other color is invalid);
            default->this.color="Unsupported";
        }
    }

    public void setDoors(int doors) {
        Doors = doors;

    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setModel(String model){
        this.model=model;
    }
    public  void describeCar(){//not static because we are accessing instance fields on the class.
        System.out.println(Doors+"-door"+" "+
                color+"-color"+" "+
                model+"-model"+" "+
                (convertible?"Convertibe":"")+" "+
                manufactures+"-manufacturer");
    }
}
