import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine().replaceAll("bigdata", "");
            int sec = str.length() / 8;
            int bd = n - sec;
            
            System.out.print(sec > bd ? "security!" : sec < bd ? "bigdata?" : "bigdata? security!");
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}