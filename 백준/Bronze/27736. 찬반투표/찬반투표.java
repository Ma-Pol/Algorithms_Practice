import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            
            int[] vote = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            int agre = 0, oppo = 0, with = 0;
            
            for(int temp : vote)
                if(temp == 1)
                    agre++;
                else if(temp == -1)
                    oppo++;
                else
                    with++;
            
            if(n == 1)
                System.out.print(agre == 1 ? "APPROVED" : oppo == 1 ? "REJECTED" : "INVALID");
            else
                System.out.print((n + 1) / 2 <= with ? "INVALID" : agre > oppo ? "APPROVED" : "REJECTED");
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}