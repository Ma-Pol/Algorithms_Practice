import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int topBurger = Integer.parseInt(br.readLine());
        int middleBurger = Integer.parseInt(br.readLine());
        int bottomBurger = Integer.parseInt(br.readLine());
        int coke = Integer.parseInt(br.readLine());
        int cider = Integer.parseInt(br.readLine());
        
        int cheapBurger = Math.min(topBurger, Math.min(middleBurger, bottomBurger));
        int cheapDrink = Math.min(coke, cider);
        
        System.out.print(cheapBurger + cheapDrink - 50);
        
        br.close();
    }
}