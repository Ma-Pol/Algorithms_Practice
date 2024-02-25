import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        LinkedList<int[]> balloons = new LinkedList<>();
        StringTokenizer input = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++)
            balloons.add(new int[]{ i + 1, Integer.parseInt(input.nextToken()) });
        
        int targetIndex = 0;
        
        while(balloons.size() != 1) {
            int nextTarget = balloons.get(targetIndex)[1];
            int nextSize = balloons.size() - 1;

            sb.append(balloons.get(targetIndex)[0]).append(" ");

            balloons.remove(targetIndex);

            if(nextTarget > 0) nextTarget--;

            targetIndex = (targetIndex + nextTarget) % nextSize;

            if(targetIndex < 0) targetIndex += nextSize;

        }

        sb.append(balloons.get(0)[0]);

        System.out.print(sb.toString());

        br.close();
    }
}