import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answer = 0;
        
        int day = Integer.parseInt(br.readLine());
        String[] carNumberArray = br.readLine().split(" ");
        
        for(String carNumber : carNumberArray) {
            int carNumberInt = Integer.parseInt(carNumber);
            
            if(day == carNumberInt) answer++;
        }
        
        System.out.print(answer);
        
        br.close();
    }
}