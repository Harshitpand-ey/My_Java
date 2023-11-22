package Stream;

import java.io.FileInputStream;

public class Stream1{
    public static void main(String[] args) {
        FileInputStream infile=null;
        try{
            infile=new FileInputStream("stream2.txt");
            int b;
            while ((b=infile.read())!=-1){
                System.out.println((char)b);
            }
            infile.close();
        }
        catch (Exception e){

        }
    }
}