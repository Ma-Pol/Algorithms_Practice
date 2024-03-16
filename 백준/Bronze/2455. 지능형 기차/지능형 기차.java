import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int maxPeople = 0;
        int tempPeople = 0;
        
        for(int i = 0; i < 4; i++) {
            String[] input = br.readLine().split(" ");
            int getOff = Integer.parseInt(input[0]);
            int getOn = Integer.parseInt(input[1]);
            
            tempPeople = tempPeople - getOff + getOn;
            
            if(maxPeople < tempPeople) maxPeople = tempPeople;
        }
        
        System.out.print(maxPeople);
        
        br.close();
    }
}