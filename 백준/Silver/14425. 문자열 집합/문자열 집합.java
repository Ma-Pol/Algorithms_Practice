import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringList = new ArrayList<>();
        
        String[] nM = (br.readLine()).split(" ");
        int N = Integer.parseInt(nM[0]);
        int M = Integer.parseInt(nM[1]);
        int count = 0;
        
        while(N-- > 0)
            stringList.add(br.readLine());
        
        while(M-- > 0)
            if(stringList.contains(br.readLine()))
                count++;
        
        System.out.print(count);
        
        br.close();
    }
}