import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int rock = 0, paper = 0, scissor = 0, result = 0;
		String[] input = br.readLine().split(" ");
		
		for (int i = 0; i < input.length; i++) {
			int tempNumber = Integer.parseInt(input[i]);
			
			if (tempNumber == 1) scissor++;
			else if (tempNumber == 2) rock++;
			else paper++;
		}
		
		if (rock != 0 && paper != 0 && scissor == 0)
			result = paper;
		else if (rock != 0 && paper == 0 && scissor != 0)
			result = rock;
		else if (rock == 0 && paper != 0 && scissor != 0)
			result = scissor;
		
		System.out.println(result);
	}
}