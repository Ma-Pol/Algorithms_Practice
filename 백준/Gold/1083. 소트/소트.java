import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++)
                list.add(Integer.parseInt(st.nextToken()));

            int S = Integer.parseInt(br.readLine());

            for(int i = 0; i < N && S > 0; i++) {
                int max = 0, maxIdx = 0;

                for(int j = i; j < N && j <= S + i; j++)
                    if(max <= list.get(j)) {
                        max = list.get(j);
                        maxIdx = j;
                    }

                list.remove(maxIdx);
                list.add(i, max);
                S -= (maxIdx - i);
            }

            for(int num : list)
                sb.append(num).append(" ");

            System.out.print(sb.toString());
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}