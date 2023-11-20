import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        int[] cardArr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++)
            cardArr[i] = Integer.parseInt(st.nextToken());


        int M = Integer.parseInt(br.readLine());
        int[] numberArr = new int[M];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++)
            numberArr[i] = Integer.parseInt(st.nextToken());


        Arrays.sort(cardArr);

        for(int i = 0; i < M; i++) {
            int left = 0;
            int right = N - 1;
            int mid = 0;
            boolean isExist = false;

            while(left <= right) {
                mid = (left + right) / 2;

                if(cardArr[mid] == numberArr[i]) {
                    isExist = true;
                    break;
                } else if(cardArr[mid] < numberArr[i]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if(isExist)
                sb.append("1 ");
            else
                sb.append("0 ");
        }

        System.out.print(sb.toString());

        br.close();
    }
}