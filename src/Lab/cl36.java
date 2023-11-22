package Lab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cl36 {
    public static void main(String[] args) {
        File myFile=new File("Student.txt");
       try{
            myFile.createNewFile();
        }catch (IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number:");
       int rollNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Enter Subject:");
       String subject=sc.next();
        System.out.println("Enter Marks:");
       int Marks=sc.nextInt();
        sc.nextLine();

        try {
            FileWriter myFileWriter = new FileWriter("Student.txt");
            myFileWriter.write("Roll no is " + rollNo + "\n");
            myFileWriter.write("Name is " + name + "\n");
            myFileWriter.write("Marks is " + Marks + "\n");
            myFileWriter.write("Subject is " + subject + "\n");

            myFileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Enter file name");
                File myFiles=new File("Student.txt");
        try{
        Scanner soc=new Scanner(myFile);
        while (soc.hasNextLine()){
            String line=soc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
