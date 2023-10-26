import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double res = 0.0;

        String grade = br.readLine();
        String grade1 = grade.substring(0, 1);
        String grade2 = grade1.equals("F") ? null : grade.substring(1, 2);
        
        switch(grade1) {
            case "A":
                res = 4.0;
                break;
            case "B":
                res = 3.0;
                break;
            case "C":
                res = 2.0;
                break;
            case "D":
                res = 1.0;
                break;
        }
        
        if(grade2 != null) {
            switch(grade2) {
                case "+":
                    res += 0.3;
                    break;
                case "-":
                    res -= 0.3;
                    break;
            }
        }
        
        
        System.out.print(res);
        
		br.close();
	}
}