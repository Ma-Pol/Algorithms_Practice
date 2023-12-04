import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String jaehwan = br.readLine();
        String doctor = br.readLine();
        
        System.out.print(jaehwan.length() >= doctor.length() ? "go" : "no");
        
        br.close();
    }
}