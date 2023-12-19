import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String input = br.readLine();
        
        switch(input) {
            case "M":
                sb.append("MatKor");
                break;
            case "W":
                sb.append("WiCys");
                break;
            case "C" :
                sb.append("CyKor");
                break;
            case "A":
                sb.append("AlKor");
                break;
            case "$":
                sb.append("$clear");
                break;
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}