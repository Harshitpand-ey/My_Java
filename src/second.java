import java.util.Scanner;

public class second {

        public static void main(String[] args) {
            int length, width, height, thick;
            System.out.println("Enter length,width,height & thick");
            Scanner sc=new Scanner(System.in);
             length=sc.nextInt();
             width= sc.nextInt();
             height= sc.nextInt();
             thick= sc.nextInt();
            woodbox obj=new woodbox(length,width,height,thick);
//            box ob=new box(length,width,height);
//            plate ob1=new plate(length,width);
            //obj.woodbox();
            //obj.box();
//            ob1.plate();
//            ob.box();
//            obj.woodbox();
            //obj.box();
//            System.out.println("length is "+ob1.length);
//            System.out.println("width is "+ob1.width);
//            System.out.println("height is "+ob.height);
//            System.out.println("thickness is "+obj.thick);
        }
}

