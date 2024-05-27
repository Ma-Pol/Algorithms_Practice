import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            
            int helmet = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
            int armor = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
            
            System.out.print(helmet + armor);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}