import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			int num = Integer.parseInt(br.readLine());

			if (num == -1) break;

			List<Integer> divisors = new ArrayList<>();
			int sum = 0;

			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					divisors.add(i);
					sum += i;
				}
			}

			if (num != 1 && num == sum) {
				Collections.sort(divisors);
				sb.append(num).append(" = ");

				for (int i = 0; i < divisors.size(); i++) {
					sb.append(divisors.get(i));

					if (i != divisors.size() - 1)
						sb.append(" + ");
				}
			} else {
				sb.append(num).append(" is NOT perfect.");
			}

			sb.append("\n");
		}

		System.out.println(sb.toString());

		br.close();
	}
}