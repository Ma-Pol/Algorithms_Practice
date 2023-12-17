import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String alp = br.readLine().toLowerCase();
        
        System.out.print(alp.equals("n") ? "Naver D2" : "Naver Whale");
        
        br.close();
    }
}