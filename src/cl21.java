import java.util.Scanner;

class TwoD{
    int length;
    int breadth;
   public TwoD(int length,int breadth){
       this.length=length;
       this.breadth=breadth;
   }
 void area2d(){
       int area=length*breadth;
       int cost=area*40;
     System.out.println("Cost of 2D sheet is=Rs "+cost);
   }

            }
   class threeD extends TwoD{
     int height;
     threeD(int length,int breadth,int height){
      super(length,breadth);
        this.height=height;
    }
  void area3e(){
       int area=2*((length*breadth)+(breadth*height)+(length*height));
     int cost=area*60;
      System.out.println("cost of 3D box is =Rs "+cost);
 }


   }
public class cl21 {
    public static void main(String[] args) {
        int length,breadth,height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dimensions");
        length= sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        threeD obj=new threeD(length,breadth,height);
        obj.area2d();
       obj.area3e();
    }
}
