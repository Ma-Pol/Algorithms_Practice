import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int chicken = Integer.parseInt(br.readLine());
        
        String[] fridge = br.readLine().split(" ");
        int coke = Integer.parseInt(fridge[0]);
        int beer = Integer.parseInt(fridge[1]);
        
        int maxChicken = coke / 2 + beer;
        
        System.out.print(chicken >= maxChicken ? maxChicken : chicken);
        
        br.close();
    }
}