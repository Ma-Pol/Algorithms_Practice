/*import java.io.*;
 
public class Main {
    public static void main(String args[]) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            double bestGSB = 0.0;
            String bestSnack = "";
            
            for(int i = 0; i < 3; i++) {
                String[] input = br.readLine().split(" ");
                double price = Double.parseDouble(input[0]);
                double weight = Double.parseDouble(input[1]);
                
                double GSB = 0.0;
                
                GSB = price + 10 >= 5000 ? 
                        (weight * 10) / (price * 10 - 500) : (weight * 10) / (price * 10);
                
                if(bestGSB < GSB) {
                    bestGSB = GSB;
                    
                    bestSnack = i == 0 ? "S" : i == 1 ? "N" : "U";
                }
            }
            
            System.out.print(bestSnack);
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}*/
import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        double bestBangforTheBuck = 0;
        String snack = "";
        
        for (int i = 1; i <= 3; i++) {
            double price = sc.nextDouble();
            double weight = sc.nextDouble();
            
            double bangForTheBuck = 0;
            
            if (price * 10 >= 5000) {
                bangForTheBuck = (weight * 10) / (price * 10 - 500);
            }
            else {
                bangForTheBuck = (weight * 10) / (price * 10 );
            }
            
            if (bestBangforTheBuck < bangForTheBuck) {
                bestBangforTheBuck = bangForTheBuck;
                if (i == 1) snack = "S";
                else if (i == 2) snack = "N";
                else if (i == 3) snack = "U";
            }
        }
        
        System.out.print(snack);
 
    }
}