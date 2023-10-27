import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        
        char[] charArr = (br.readLine()).toCharArray();
        
        for(char ch : charArr) {
            if('A' <= ch && ch <= 'C') res += 3;
            if('D' <= ch && ch <= 'F') res += 4;
            if('G' <= ch && ch <= 'I') res += 5;
            if('J' <= ch && ch <= 'L') res += 6;
            if('M' <= ch && ch <= 'O') res += 7;
            if('P' <= ch && ch <= 'S') res += 8;
            if('T' <= ch && ch <= 'V') res += 9;
            if('W' <= ch && ch <= 'Z') res += 10;
        }
        
        System.out.print(res);

		br.close();
	}
}