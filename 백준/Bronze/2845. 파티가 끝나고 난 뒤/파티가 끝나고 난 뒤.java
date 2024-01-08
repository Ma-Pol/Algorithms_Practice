import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        
        int personPerMeterSquare = Integer.parseInt(input1[0]);
        int areaSize = Integer.parseInt(input1[1]);
        
        int maxPerson = personPerMeterSquare * areaSize;
        
        for(int i = 0; i < input2.length; i++) {
            int person = Integer.parseInt(input2[i]);
            
            sb.append(person - maxPerson);
            
            if(i != input2.length - 1)
                sb.append(" ");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}