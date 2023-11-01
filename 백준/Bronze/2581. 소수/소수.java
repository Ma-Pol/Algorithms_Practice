import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = N;

		loop:
		for(int i = M; i <= N; i++) {
			if(i == 1) continue;

			for(int j = 2; j < i; j++)
				if(i % j == 0) continue loop;

			sum += i;

			if(min > i)
				min = i;
		}

		if(sum == 0)
			sb.append(-1);
		else
			sb.append(sum).append("\n").append(min);

		System.out.print(sb.toString());

		br.close();
	}
}