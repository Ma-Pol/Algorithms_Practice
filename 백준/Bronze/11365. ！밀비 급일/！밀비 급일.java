import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        
        while(true) {
            String sentence = br.readLine();
            
            if(sentence.equals("END")) break;
            
            StringBuilder sb = new StringBuilder(sentence);
            
            answer.append(sb.reverse().toString()).append("\n");
        }
        
        System.out.print(answer.toString());
        
        br.close();
    }
}