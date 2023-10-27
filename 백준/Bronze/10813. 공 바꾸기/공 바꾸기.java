import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] nAndM = (br.readLine()).split(" ");
        int[] basket = new int[Integer.parseInt(nAndM[0])];
        int M = Integer.parseInt(nAndM[1]);
        
        for(int i = 0; i < basket.length; i++)
            basket[i] = i + 1;
        
        while(M > 0) {
            String[] nums = (br.readLine()).split(" ");
            int first = Integer.parseInt(nums[0]) - 1;
            int second = Integer.parseInt(nums[1]) - 1;
            
            int temp = basket[first];
            basket[first] = basket[second];
            basket[second] = temp;
            
            M--;
        }
        
        for(int ballNum : basket)
            sb.append(ballNum + " ");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}