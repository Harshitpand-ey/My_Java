import java.util.Scanner;

class plate {

    int length;
    int width;
    plate(int length,int width)
    {
        //Scanner sc=new Scanner(System.in);
        //  System.out.println("enter length and width");
        // this.length=sc.nextInt();
        //   this.width=sc.nextInt();
        this.length=length;
        this.width=width;
        System.out.println(length+" is the length "+width+" is the width of plate");

    }
}
class box extends plate
{
    int height;
    box(int length,int width,int height)
    {
        super(length,width);
        // Scanner sc=new Scanner(System.in);
        //  System.out.println("enter height");
        this.height=height;
        // this.height=sc.nextInt();
        System.out.println(length+" is the length"+width+" is the width "+height+" is the height of box");

    }
}
class woodbox extends box
{
    int thick;
    woodbox(int length,int width,int height,int thick)
    {
        super( length, width, height);
        //   Scanner sc=new Scanner(System.in);
        // System.out.println("enter thickness");
        this.thick=thick;
        System.out.println(length+" is the length "+width+" is the width "+height+" is  height "+thick+" is the thickness of woodbox");
    }
}


public class cl22 {
    public static void main(String[] args) {
        int length, width, height, thick;
        System.out.println("Enter length,width,height & thick");
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        width= sc.nextInt();
        height= sc.nextInt();
        thick= sc.nextInt();
        woodbox obj=new woodbox(length,width,height,thick);

    }
}
