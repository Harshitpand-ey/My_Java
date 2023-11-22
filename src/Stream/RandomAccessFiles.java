package Stream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiles {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("hii.txt","rw");
        String s= raf.readLine();
        long p=raf.getFilePointer();//Returns the current offset in the file;
       while (true) {
           if (s == null) {
               break;
           }
           //System.out.println(s);used to print content of the file;
           if(raf.equals("pandey")){//Wherever we got pandey We replace it by PANDEY
               raf.seek(p);//Sets the file-pointer offset, measured from the beginning of this file, at which the next read or write occurs.
               raf.writeBytes("PANDEY");//writes a string of data to the file at the current file pointer position.
           }
          // System.out.println(s);
       }
       raf.close();
    }
}
