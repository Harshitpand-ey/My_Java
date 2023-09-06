class Animal{
    protected String type;
    private String size;
    private double weight;


    public Animal(String type, String size, double weight) {//constructor
        this.type = type;
        this.size = size;
        this.weight = weight;
    }




    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed){//method for the speed of animal
        System.out.println(type+" moves "+speed);

    }
    public void makeNoise(){//a method without argument for making noise of animal;

        System.out.println(type+" make some kind of noise");
    }
}
public class inheritance_1 {
    public static void main(String[] args) {
        //Animal animal=new Animal("Generic animal","huge",400);//creating the instance for the object
         //doAnimalStuff(animal,"slow");//method in same class so no need of class.methodname
    Dog2 dog=new Dog2();
    doAnimalStuff(dog,"fast");
    Cat9  cat=new Cat9();
    doAnimalStuff(cat,"Slow");
        Dog2 yorkie=new Dog2("yorkie",15);
        doAnimalStuff(yorkie,"fast");
        Dog2 retreiver=new Dog2("labrador",35,"floppy","curled");
        doAnimalStuff(retreiver,"slow");
        Dog2 wolf=new Dog2("Wolf",43);
        doAnimalStuff(wolf,"slow");
        Fish goldie=new Fish("Goldie",3,2,4);
        doAnimalStuff(goldie,"fast");
    }
    public static void doAnimalStuff(Animal animal,String speed){//here animal is a argument;
        animal.makeNoise();//method calling;
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

}
 class Dog2 extends Animal{//extend helps to specify that Animal is parent class or super class of Dog2
    private String earShape;
    private String tailShape;
    public Dog2(){//1st subclass for the dog type mutt or constructor;
        super("mutt","small",40);//super is used to call the constructor which is on line 7-11;

    }
    //Below is second subclass for the dog type retreiver;
    public Dog2(String type,double weight){//this is used here to access the private field of Dog2 subclass;
        this(type,weight,"perky","curled");
    }
    public Dog2(String type,double weight,String earShape,String tailShape){//constructor for Dog2 with parameters type ,weight,earShape,tailShape;
        super(type,(weight<15?"small":(weight<35?"medium":"large")),weight);//here we access the features or codes of Super class Animal or parent class by using super keyword ;
        this.earShape=earShape;
        this.tailShape=tailShape;

    }


     @Override
     public String toString() {//this string is used to print the String values of this Dog2 class
         return "Dog2{" +
                 "earShape='" + earShape + '\'' +
                 ", tailShape='" + tailShape + '\'' +
                 "} " + super.toString();
     }
     public void makeNoise(){//method overriding;
        if(type=="Wolf"){
            System.out.println("ow wooo!");
        }
        else {
            bark();
        }
         System.out.println();
     }

     @Override
     public void move(String speed) {//Here we override a method means making a method in child class with same name which is also in parent class on line 24 in super or Parent class we can see we declare a method move with argument speed;
         super.move(speed);
       //  System.out.println("dogs walk ,run and move faster");
         if(speed=="slow"){//if the speed of the dog is slow then the walk and bark method will be printed;
             walk();
             wagTail();
         }
         else{//if the speed of Dog is faster or medium also then run and bark method will be printed;
             run();
             bark();
         }
      //   System.out.println();
    }
     public void bark(){
         System.out.println("woof");
     }
     public void run(){
         System.out.println("Dog running");
     }
     public void walk(){
         System.out.println("Dog walking");
     }
     public void wagTail(){
         System.out.println("tail wagging");
     }
 }
class Cat9 extends Animal{//sub or child class calling to parent or super class Animal by using extend keyword;
    public Cat9(){//constructor of class Cat9;

        super("cuties cat","very small",3);
    }
}
class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String type,  double weight, int gills, int fins) {//we are not using the String size in constructor instead of it we declare in super class;
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    public void moveMuscles(){
        System.out.println("muscles moving:");
    }
    public void moveBackFin(){
        System.out.println("backfins are moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed=="fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}


