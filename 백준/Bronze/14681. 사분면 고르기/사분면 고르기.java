import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int res = 0;

        if(a > 0) {
            res = b > 0 ? 1 : 4;
        } else {
            res = b > 0 ? 2 : 3;
        }
        
		System.out.println(res);

		br.close();
	}
}