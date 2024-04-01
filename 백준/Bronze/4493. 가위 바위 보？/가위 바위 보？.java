import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            int T = Integer.parseInt(br.readLine());
            
            int p1 = 0, p2 = 0;
            
            while(T-- > 0) {
                String[] rps = br.readLine().split(" ");
                String p1Res = rps[0];
                String p2Res = rps[1];
                
                switch(p1Res) {
                    case "R":
                        if(p2Res.equals("P"))
                            p2++;
                        else if(p2Res.equals("S"))
                            p1++;
                        break;
                    case "P":
                        if(p2Res.equals("S"))
                            p2++;
                        else if(p2Res.equals("R"))
                            p1++;
                        break;
                    case "S":
                        if(p2Res.equals("R"))
                            p2++;
                        else if(p2Res.equals("P"))
                            p1++;
                        break;
                }
            }
            
            sb.append(p1 > p2 ? "Player 1" : p1 < p2 ? "Player 2" : "TIE").append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}