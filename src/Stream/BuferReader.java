package Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuferReader {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s= br.readLine();
        System.out.println(s);
        System.out.println(n);
    }
}
