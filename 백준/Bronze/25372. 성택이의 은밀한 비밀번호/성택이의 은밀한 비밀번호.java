import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            int passLength = br.readLine().length();

            if(6 <= passLength && passLength <= 9)
                sb.append("yes\n");
            else
                sb.append("no\n");
        }

        System.out.print(sb.toString());

        br.close();
    }
}