public class objectOfHouse {
    public static void main(String[] args) {
        House blueHouse=new House("blue");//this line creates the new instance or object for the House  class;
         //remember House is a blueprint, which is already declared or defined in file or class House. and now  we are assigning House  to the blueHouse Variable
        //In other words it is a reference to the  object in memory ;Object of type=House;
        House anotherHouse=blueHouse;//creates another reference to the same Object(blueHouse);
        //So here we have two references(blueHouse & anotherHouse) pointing to the same class (House);
        //In simple words we have two pieces of paper with the physical address of where the house is built;
        System.out.println(blueHouse.getColor());//prints blue;
        System.out.println(anotherHouse.getColor());//blue
        //So above we have two println statement that prints the blueHouse color and anotherHouse color .
        //Both will print the same color "blue" since we have two references to the same object;
        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor());//prints yellow;
        System.out.println(anotherHouse.getColor());//prints yellow;
        //Above we change the color of one reference ,color of both references change since we point to the same object(House);
       //Above statement is same for below statements 18-21 line;
        blueHouse.setColor("green");
        System.out.println(anotherHouse.getColor());//prints green;
        System.out.println(blueHouse.getColor());//prints green;
        House redHouse=new House("red");//Now we have two objects(House) and three references(blueHouse,anotherHouse & redHouse).
        //The variable(reference) redHouse points to a different object(House) in memory ,but blueHouse & anotherHouse points to the same object(House) in the memory;
         anotherHouse=redHouse;
        System.out.println(blueHouse.getColor());//prints green;
        System.out.println(anotherHouse.getColor());//prints red;
        System.out.println(redHouse.getColor());//prints red;

    }
}
