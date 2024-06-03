import java.io.*;
 
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
                
                GSB = price * 10 >= 5000 ? 
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
}