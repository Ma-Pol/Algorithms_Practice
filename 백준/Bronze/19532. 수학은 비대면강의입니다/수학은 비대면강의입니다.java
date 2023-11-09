import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = (br.readLine()).split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);

        int y = (c * d - f * a) / (b * d - e * a);
        int x = a == 0 ? ((f - e * y) / d) : ((c - b * y) / a);
        
        System.out.print(sb.append(x).append(" ").append(y));
        
        br.close();
    }
}
