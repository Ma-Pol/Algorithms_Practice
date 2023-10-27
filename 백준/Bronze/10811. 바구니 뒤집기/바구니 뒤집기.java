import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] nAndM = (br.readLine()).split(" ");
        int N = Integer.parseInt(nAndM[0]);
        int M = Integer.parseInt(nAndM[1]);
        
        int[] basket = new int[N];
        
        for(int i = 0; i < basket.length; i++)
            basket[i] = i + 1;
        
        while(M-- > 0) {
            String[] index = (br.readLine()).split(" ");
            int i = Integer.parseInt(index[0]) - 1;
            int j = Integer.parseInt(index[1]) - 1;
            
            if(i == j) continue;
            
            for(int x = i; x < j; x++) {
                int temp = basket[x];
                basket[x] = basket[j];
                basket[j] = temp;
                j--;
            }
        }
        
        for(int basketNum : basket)
            sb.append(basketNum + " ");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}