import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            String[] testCase = (br.readLine()).split(" ");
            int count = Integer.parseInt(testCase[0]);
            String str = testCase[1];
            
            for(int i = 0; i < str.length(); i++) {
                String subStr = str.substring(i, i + 1);
                
                sb.append(subStr.repeat(count));
            }
            
            sb.append("\n");
        }

		System.out.print(sb.toString());

		br.close();
	}
}