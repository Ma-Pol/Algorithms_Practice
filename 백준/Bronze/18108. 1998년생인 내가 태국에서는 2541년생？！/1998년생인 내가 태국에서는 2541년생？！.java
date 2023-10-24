import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        System.out.print(Integer.parseInt(num) - 543);

		br.close();
	}
}