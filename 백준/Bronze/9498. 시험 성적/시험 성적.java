import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int score = Integer.parseInt(br.readLine());
        StringBuilder grade = new StringBuilder();
        
        if(score >= 90) {
            grade.append("A");
        } else if(score >= 80) {
            grade.append("B");
        } else if(score >= 70) {
            grade.append("C");
        } else if(score >= 60) {
            grade.append("D");
        } else {
            grade.append("F");
        }
        
        System.out.print(grade.toString());

		br.close();
	}
}