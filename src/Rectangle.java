import java.util.Scanner;

public class Rectangle {
  private   int length;
   private  int breadth;
    int perimeter;
    int area;

     Rectangle(int l,int b){
         length=l;
         breadth=b;

    }
    void read(){
        System.out.println("length:"+ length);
        System.out.println("breadth:" + breadth
        );



    }
    void calculate(){
         perimeter=2*(length+breadth);
         area=length*breadth;
    }
    void display(){
        System.out.println("Perimeter of rectangle ="+perimeter);
        System.out.println("Area of the rectangle ="+area);

    }
}
class Harshit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int a = sc.nextInt();
        System.out.println("enter breadth");
        int b = sc.nextInt();
        Rectangle r = new Rectangle(a,b);
        r.read();
        r.calculate();
        r.display();


    }
}
