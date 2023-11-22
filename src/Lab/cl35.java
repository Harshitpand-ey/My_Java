package Lab;

import java.io.*;

public class cl35 {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            System.out.print("Enter the source file name: ");
            String sourceFileName = reader.readLine();

            System.out.print("Enter the destination file name: ");
            String destinationFileName = reader.readLine();


            FileReader fileReader = new FileReader(sourceFileName);
            FileWriter fileWriter = new FileWriter(destinationFileName);

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            fileReader.close();
            fileWriter.close();

            System.out.println("File copied successfully using character streams.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }






}