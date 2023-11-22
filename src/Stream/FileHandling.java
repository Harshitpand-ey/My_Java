package Stream;

import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        //Code to Create new file
//        File myFile=new File("FileHandling2245.txt");
//        try{
//            myFile.createNewFile();
//        }catch (IOException e){
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }
        //Code to write a file;
//        try {
//            FileWriter myFileWriter = new FileWriter("FileHandling2245.txt");
//            myFileWriter.write("This is our 1st file from this java course");
//            myFileWriter.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
        //Code to read a file;
//        File myFile=new File("this.txt");
//        try{
//        Scanner sc=new Scanner(myFile);
//        while (sc.hasNextLine()){
//            String line=sc.nextLine();
//            System.out.println(line);
//        }
//        sc.close();
//    }
//        catch (Exception e){
//            e.printStackTrace();
//        }
        //Deleting A file;
        File myFile=new File("FileHandling2245.txt");
        if(myFile.delete()){
            System.out.println("I have deleted "+myFile.getName());
        }
        else{
            System.out.println("Some error occured during deleting the file");
        }
    }
}
