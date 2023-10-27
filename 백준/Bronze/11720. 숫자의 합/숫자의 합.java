import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        String[] numStrArr = (br.readLine()).split("");
        int sum = 0;
        
        for(String numStr : numStrArr)
            sum += Integer.parseInt(numStr);
        
        System.out.print(sum);
        
        br.close();
    }
}