import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        
        while(!input[0].equals("#")) {
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            
            sb.append(name).append(" ");
            
            if(age > 17 || weight >= 80) {
                sb.append("Senior\n");
            } else {
                sb.append("Junior\n");
            }
            
            input = br.readLine().split(" ");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}