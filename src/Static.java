class Dog{
    private static String name;

    public Dog(String name){//constructor;
        this.name=name;
    }
    public void printName(){
        System.out.println(name);
    }

}
public class Static {
    public static void main(String[] args) {
        Dog1 rex=new Dog1("rex");
        Dog1 fluffy=new Dog1("fluffy");
        rex.printName();//calling the method printName;//print fluffy;
        fluffy.printName();//print fluffy
        //both prints fluffy due to static keyword use in the name so the last name is fluffy declared so its fluffy for both;

    }
}
