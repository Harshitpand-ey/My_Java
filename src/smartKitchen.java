public class smartKitchen {
    private CoffeeMaker brewMaster;//CoffeeMaker is the class and brewCoffee is the method inside it
    private DishWasher dishWasher;//Similarly DishWasher is the class and dishWasher is the method;
    private Refrigerator iceBox;//Refrigerator is Class and iceBox is the method present inside it;

    public smartKitchen() {//it allows to do all the task related to smartkitchen like coffeeMaker,Refrigerator and Dishwasher within a one constructor that helps to use this method integeratedly in one place;
        brewMaster = new CoffeeMaker();//creating instance of method brewMaster of class CoffeeMaker;
        iceBox = new Refrigerator();  //''
        dishWasher = new DishWasher();//''

    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("brewing coffee");
            hasWorkToDo=false;
        }
    }
}
class Refrigerator{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering food");
            hasWorkToDo=false;
        }
    }
}
class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Wash the dishes");
            hasWorkToDo=false;
        }
    }
}
