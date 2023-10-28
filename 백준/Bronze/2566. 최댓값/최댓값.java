import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int maxNum = 0;
        int row = 1;
        int col = 1;
        
        for(int i = 0; i < 9; i++) {
            String[] tempRow = (br.readLine()).split(" ");
            
            for(int j = 0; j < 9; j++) {
                int temp = Integer.parseInt(tempRow[j]);
                
                if(maxNum < temp) {
                    maxNum = temp;
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        
        System.out.print(sb.append(maxNum).append("\n")
                         .append(row).append(" ").append(col));
        
        br.close();
    }
}