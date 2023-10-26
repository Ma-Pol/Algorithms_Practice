import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= N; i++)
            if(i != N)
                sb.append(i + "\n");
            else
                sb.append(i);
        
        System.out.print(sb.toString());
        
		br.close();
	}
}