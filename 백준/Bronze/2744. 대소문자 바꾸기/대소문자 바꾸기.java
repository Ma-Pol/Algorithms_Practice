import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            String ch = str.substring(i, i + 1);
            
            if(isStringUpperCase(ch))
                sb.append(ch.toLowerCase());
            else
                sb.append(ch.toUpperCase());
        }
        
        System.out.print(sb.toString());
        
		br.close();
	}
    
    private static boolean isStringUpperCase(String str) {
        return str.equals(str.toUpperCase());
    }
}