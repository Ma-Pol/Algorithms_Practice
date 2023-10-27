import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String temp = br.readLine();
        
        while(temp != null) {
            sb.append(temp).append("\n");
            
            temp = br.readLine();
        }
        
        System.out.print(sb.toString());

		br.close();
	}
}