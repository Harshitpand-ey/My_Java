public class Kitchen {

    public static void main(String[] args) {
        smartKitchen kitchen=new smartKitchen();
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();
        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }




}
