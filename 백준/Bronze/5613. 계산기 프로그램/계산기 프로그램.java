import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answer = Integer.parseInt(br.readLine());
        
        loop:
        while(true) {
            String input = br.readLine();
            
            switch(input) {
                case "+":
                    answer += Integer.parseInt(br.readLine());
                    break;
                case "-":
                    answer -= Integer.parseInt(br.readLine());
                    break;
                case "*":
                    answer *= Integer.parseInt(br.readLine());
                    break;
                case "/":
                    answer /= Integer.parseInt(br.readLine());
                    break;
                case "=":
                    break loop;
            }
        }
        
        System.out.print(answer);
        
        br.close();
    }
}