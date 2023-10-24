import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nums = br.readLine();
        
        String[] num = nums.split(" ");
        
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int c = Integer.parseInt(num[2]);

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);

		br.close();
	}
}