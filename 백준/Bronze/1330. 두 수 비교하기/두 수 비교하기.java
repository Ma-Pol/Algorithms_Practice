import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nums[] = (br.readLine()).split(" ");
        
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        System.out.print(a > b ? ">" : a == b ? "==" : "<");

		br.close();
	}
}