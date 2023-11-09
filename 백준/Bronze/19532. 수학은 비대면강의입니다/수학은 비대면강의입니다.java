import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = (br.readLine()).split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);
        
        loop:
        for(int x = -999; x <= 999; x++)
            for(int y = -999; y <= 999; y++)
                if(a * x + b * y == c && d * x + e * y == f) {
                    sb.append(x).append(" ").append(y);
                    break loop;
                }
        
        System.out.print(sb.toString());

		br.close();
	}
}