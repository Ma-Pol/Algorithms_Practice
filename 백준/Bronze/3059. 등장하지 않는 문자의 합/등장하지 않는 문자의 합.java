import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] alps = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
                         "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
                         "U", "V", "W", "X", "Y", "Z" };
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            String input = br.readLine();
            int sum = 0;
            
            for(int i = 0; i < alps.length; i++)
                if(!input.contains(alps[i]))
                    sum += (i + 65);
            
            sb.append(sum).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}