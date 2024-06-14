import java.io.*;

public class Main {
    static String[][] mbti = { { "E", "I" }, { "S", "N" }, { "T", "F" }, { "J", "P" } };
    
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            String[] input = br.readLine().split("");
            
            for(int i = 0; i < input.length; i++)
                sb.append(input[i].equals(mbti[i][0]) ? mbti[i][1] : mbti[i][0]);
            
            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}