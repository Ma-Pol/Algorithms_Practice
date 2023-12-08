import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] aInput = br.readLine().split(" ");
        String[] cInput = br.readLine().split(" ");
        
        int ax = Integer.parseInt(aInput[0]);
        int ay = Integer.parseInt(aInput[1]);
        int az = Integer.parseInt(aInput[2]);
        
        int cx = Integer.parseInt(cInput[0]);
        int cy = Integer.parseInt(cInput[1]);
        int cz = Integer.parseInt(cInput[2]);
        
        sb.append(cx - az).append(" ").append(cy / ay).append(" ").append(cz - ax);
        
        System.out.print(sb.toString());        
        
        br.close();
    }
}