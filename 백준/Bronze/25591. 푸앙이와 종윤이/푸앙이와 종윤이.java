import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        
        int a = 100 - x;
        int b = 100 - y;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;
        
        sb.append(a)
            .append(" ")
            .append(b)
            .append(" ")
            .append(c)
            .append(" ")
            .append(d)
            .append(" ")
            .append(q)
            .append(" ")
            .append(r)
            .append("\n")
            .append(c + q)
            .append(" ")
            .append(r);
        
        System.out.print(sb.toString());
        
        br.close();
    }
}