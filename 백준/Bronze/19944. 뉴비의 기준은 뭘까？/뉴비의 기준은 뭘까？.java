import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        if(M <= 2) {
            answer.append("NEWBIE!");
        } else if(M <= N) {
            answer.append("OLDBIE!");
        } else {
            answer.append("TLE!");
        }
        
        System.out.print(answer.toString());
        
        br.close();
    }
}