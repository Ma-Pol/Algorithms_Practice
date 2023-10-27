import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] alphabet = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        
        char[] strChar = (br.readLine()).toCharArray();
        int temp = 0;
        
        for(char ch : strChar) {
            int charInt = (int) ch;
            
            if(alphabet[charInt - 97] == -1)
                alphabet[charInt - 97] = temp;
            
            temp++;
        }
        
        for(int alphabetPosition : alphabet)
            sb.append(alphabetPosition + " ");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}