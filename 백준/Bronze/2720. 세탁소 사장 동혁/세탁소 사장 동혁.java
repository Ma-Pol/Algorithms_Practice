import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] changeCriterias = { 25, 10, 5, 1 };
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0) {
            int money = Integer.parseInt(br.readLine());
            
            for(int changeCriteria : changeCriterias) {
                sb.append(money / changeCriteria).append(" ");
                money %= changeCriteria;
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}