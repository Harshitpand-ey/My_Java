import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Enter length,width & height of a box:");
        Scanner sc=new Scanner(System.in);
        int length= sc.nextInt();
        int width= sc.nextInt();
        int height= sc.nextInt();
        fileBox mybox=new fileBox(length,width,height);
        int boxVolume= mybox.volume();
        System.out.println("The calculated volume of the box ="+boxVolume);

    }
}

