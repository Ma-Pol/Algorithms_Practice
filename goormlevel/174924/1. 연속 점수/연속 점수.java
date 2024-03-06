import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int maxScore, conScore, tempConScore;
		
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] S = new int[N];
		
		for (int idx = 0; idx < N; idx++)
			S[idx] = Integer.parseInt(input[idx]);
		
		
		maxScore = conScore = tempConScore = S[0];
		
		for (int i = 1; i < N; i++) {
			if (maxScore < S[i]) maxScore = S[i];
			
			if (S[i] == S[i - 1] + 1) tempConScore += S[i];
			else tempConScore = S[i];
			
			if (conScore < tempConScore) conScore = tempConScore;
		}
		
		System.out.println(Math.max(maxScore, conScore));
		
		
		br.close();
	}
}