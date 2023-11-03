import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int degree1 = Integer.parseInt(br.readLine());
        int degree2 = Integer.parseInt(br.readLine());
        int degree3 = Integer.parseInt(br.readLine());
        
        if(degree1 + degree2 + degree3 != 180)
            sb.append("Error");
        else
            if(degree1 == degree2 && degree2 == degree3)
                sb.append("Equilateral");
            else if(degree1 == degree2 || degree1 == degree3 || degree2 == degree3)
                sb.append("Isosceles");
            else 
                sb.append("Scalene");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}