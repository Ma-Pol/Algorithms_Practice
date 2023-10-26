import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = (br.readLine()).split(" ");
		int a = (int) Math.pow(Integer.parseInt(nums[0]), 2);
		int b = (int) Math.pow(Integer.parseInt(nums[1]), 2);
		int c = (int) Math.pow(Integer.parseInt(nums[2]), 2);
		int d = (int) Math.pow(Integer.parseInt(nums[3]), 2);
		int e = (int) Math.pow(Integer.parseInt(nums[4]), 2);

		System.out.print((a + b + c + d + e) % 10);

		br.close();
	}
}