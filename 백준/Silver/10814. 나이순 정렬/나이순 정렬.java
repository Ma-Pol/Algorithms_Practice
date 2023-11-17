import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String[][] members = new String[N][];
        
        for(int i = 0; i < N; i++)
            members[i] = (br.readLine()).split(" ");
        
        Arrays.sort(members, (member1, member2) -> {
            return Integer.parseInt(member1[0]) - Integer.parseInt(member2[0]);
        });
        
        for(String[] member : members)
            sb.append(member[0]).append(" ").append(member[1]).append("\n");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}