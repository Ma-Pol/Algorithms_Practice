import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            int s1 = Integer.parseInt(input[0]);
            int s2 = Integer.parseInt(input[1]);

            boolean sampleTest = checkAnswer(s1, br);
            boolean systemTest = checkAnswer(s2, br);

            System.out.print(sampleTest && systemTest ? "Accepted" :
                    sampleTest ? "Why Wrong!!!" : "Wrong Answer");
        } catch(IOException e) {
            e.getStackTrace();
        }
    }

    static boolean checkAnswer(int s, BufferedReader br) throws IOException {
        while(s > 0) {
            String[] testCase = br.readLine().split(" ");

            if(testCase[0].equals(testCase[1])) s--;
            else break;
        }

        return s == 0;
    }
}