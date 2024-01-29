import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        
        String[] birth = br.readLine().split(" ");
        String[] today = br.readLine().split(" ");
        
        int birthY = Integer.parseInt(birth[0]);
        int birthM = Integer.parseInt(birth[1]);
        int birthD = Integer.parseInt(birth[2]);
        
        int todayY = Integer.parseInt(today[0]);
        int todayM = Integer.parseInt(today[1]);
        int todayD = Integer.parseInt(today[2]);
        
        int age1 = todayY - birthY - 1;
        int age2 = todayY - birthY + 1;
        int age3 = todayY - birthY;
        
        if((todayM == birthM && todayD >= birthD) || (todayM > birthM)) {
            age1++;
        }
        
        System.out.println(age1);
        System.out.println(age2);
        System.out.print(age3);
        
        br.close();
    }
}