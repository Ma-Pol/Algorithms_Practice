import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        if(a + b == c)
            sb.append(a).append("+").append(b).append("=").append(c);
        else if(a == b + c)
            sb.append(a).append("=").append(b).append("+").append(c);
        else if(a - b == c)
            sb.append(a).append("-").append(b).append("=").append(c);
        else if(a == b - c)
            sb.append(a).append("=").append(b).append("-").append(c);
        else if(a * b == c)
            sb.append(a).append("*").append(b).append("=").append(c);
        else if(a == b * c)
            sb.append(a).append("=").append(b).append("*").append(c);
        else if(a / b == c)
            sb.append(a).append("/").append(b).append("=").append(c);
        else
            sb.append(a).append("=").append(b).append("/").append(c);
        
        System.out.print(sb.toString());
        
        br.close();
    }
}