import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] aInput = br.readLine().split(" ");
            String[] bInput = br.readLine().split(" ");
            
            int aAtk = Integer.parseInt(aInput[0]);
            int aHp = Integer.parseInt(aInput[1]);
            int bAtk = Integer.parseInt(bInput[0]);
            int bHp = Integer.parseInt(bInput[1]);
            
            while(aHp > 0 && bHp > 0) {
                aHp -= bAtk;
                bHp -= aAtk;
            }
            
            System.out.print(aHp <= 0 && bHp <= 0 ? "DRAW" : aHp <= 0 ? "PLAYER B" : "PLAYER A");
        } catch(IOException e) {
            e.getStackTrace();
        }
    }
}