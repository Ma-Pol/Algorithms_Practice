import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answerNum = 0;
        String answer = "";
        int N = 10;
        
        while(N-- > 0) 
            answerNum += Integer.parseInt(br.readLine());
        
        answerNum %= 4;
        
        switch(answerNum) {
            case 0:
                answer = "N";
                break;
            case 1:
                answer = "E";
                break;
            case 2:
                answer = "S";
                break;
            case 3:
                answer = "W";
                break;
        }
        
        System.out.print(answer);
        
        br.close();
    }
}