import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String input = br.readLine();
        
        switch(input) {
            case "NLCS":
                sb.append("North London Collegiate School");
                break;
            case "BHA":
                sb.append("Branksome Hall Asia");
                break;
            case "KIS":
                sb.append("Korea International School");
                break;
            case "SJA":
                sb.append("St. Johnsbury Academy");
                break;
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}