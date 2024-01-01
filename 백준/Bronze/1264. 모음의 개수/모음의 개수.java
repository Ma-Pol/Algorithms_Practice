import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String sentence = br.readLine().toLowerCase();
        
        while(!sentence.equals("#")) {
            int originLength = sentence.length();
            
            String changedSentence = sentence.replaceAll("a|e|i|o|u", "");
            
            int changedLength = changedSentence.length();
            
            sb.append(originLength - changedLength).append("\n");
            
            sentence = br.readLine().toLowerCase();
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}