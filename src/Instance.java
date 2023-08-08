class Dog1 {
    private  String name;

    public Dog1(String name){//constructor;
        this.name=name;
    }
    public void printName(){
        System.out.println(name);
    }

}
public class Instance {
    public static void main(String[] args) {
        Dog1 rex=new Dog1("rex");
        Dog1 fluffy=new Dog1("fluffy");
        rex.printName();//calling the method printName;//print rex;
        fluffy.printName();//print fluffy
        //since we use instance variable means we haven't use static keyword so both names are different;

    }
}

