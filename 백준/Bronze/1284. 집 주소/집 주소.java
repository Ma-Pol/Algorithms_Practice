import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String input = br.readLine();
            
            if(input.equals("0")) break;
            
            char[] inputArr = input.toCharArray();
            int length = 2;
            length += (inputArr.length - 1);
            
            for(char ch : inputArr) {
                switch(ch) {
                    case '1':
                        length += 2;
                        break;
                    case '0':
                        length += 4;
                        break;
                    default:
                        length += 3;
                        break;
                }
            }
            
            sb.append(length).append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}