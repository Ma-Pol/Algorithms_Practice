import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int repeat = 3;
        
        while(repeat-- > 0) {
            String[] input = br.readLine().split(" ");
            int front = 0;
            
            for(String temp : input)
                if(temp.equals("0")) front++;
            
            switch(front) {
                case 0:
                    sb.append("E");
                    break;
                case 1:
                    sb.append("A");
                    break;
                case 2:
                    sb.append("B");
                    break;
                case 3:
                    sb.append("C");
                    break;
                case 4:
                    sb.append("D");
                    break;
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}