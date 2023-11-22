package Lab;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class cl37 {

    public static void main(String[] args) {
        File myfile=new File("example.txt");
        try
        {
            myfile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("unable to create this file");
            e.printStackTrace();
        }


        String fileName = "example.txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int charCount = 0;
            int lineCount = 0;
            int wordCount = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    tokenizer.nextToken();
                    wordCount++;
                }
            }

            fileReader.close();
            bufferedReader.close();

            System.out.println("No. of characters: " + charCount);
            System.out.println("No. of lines: " + lineCount);
            System.out.println("No. of words: " + wordCount);

        } catch (IOException e) {
            System.err.println("File not found or error reading the file: " + e.getMessage());
        }
    }
}