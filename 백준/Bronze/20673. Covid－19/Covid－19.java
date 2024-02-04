import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int newCases = Integer.parseInt(br.readLine());        
        int newHospitalizations = Integer.parseInt(br.readLine());
        
        if(newHospitalizations > 30) {
            System.out.print("Red");
        } else if(newCases <= 50 && newHospitalizations <= 10) {
            System.out.print("White");
        } else {
            System.out.print("Yellow");
        }
        
        br.close();
    }
}