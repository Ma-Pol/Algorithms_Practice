import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = (br.readLine()).split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int V = Integer.parseInt(inputs[2]);
        
        int result = (V - B) / (A - B);
        
        if((V - B) % (A - B) != 0)
            result++;
        
        System.out.print(result);
        
        br.close();
    }
}