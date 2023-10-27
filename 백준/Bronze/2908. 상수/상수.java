import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = (br.readLine()).split(" ");
        StringBuilder num1 = new StringBuilder(nums[0]).reverse();
        StringBuilder num2 = new StringBuilder(nums[1]).reverse();
        
		System.out.print(
            Math.max(Integer.parseInt(num1.toString()), Integer.parseInt(num2.toString()))
        );

		br.close();
	}
}