import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int studentNumber = 0;
        
        int[] scores = new int[5];
        int T = Integer.parseInt(br.readLine());
        String[] inputScores = br.readLine().split(" ");
        
        for(int i = 0; i < inputScores.length; i++) {
            scores[i] = Integer.parseInt(inputScores[i]);
        }
        
        int diffBtwnKoreanAndEnglish = Math.abs(scores[0] - scores[2]);
        int diffBtwnMathAndExp = Math.abs(scores[1] - scores[3]);
        int secondLanguage = scores[4];
        
        studentNumber += scores[0] > scores[2] ? diffBtwnKoreanAndEnglish * 508 : diffBtwnKoreanAndEnglish * 108;
        studentNumber += scores[1] > scores[3] ? diffBtwnMathAndExp * 212 : diffBtwnMathAndExp * 305;
        studentNumber += secondLanguage != 0 ? secondLanguage * 707 : 0;
        studentNumber *= 4763;
        
        System.out.print(studentNumber);
        
        br.close();
    }
}