import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());

            while(n-- > 0) {
                int x = Integer.parseInt(br.readLine());

                for(int i = 0; i <= x - 1; i++) {
                    if(i == 0)
                        sb.append("#".repeat(x)).append("\n");
                    else if(i == x - 1)
                        sb.append("#".repeat(x)).append("\n");
                    else
                        sb.append("#").append("J".repeat(x - 2)).append("#\n");
                }

                if(n != 0)
                    sb.append("\n");
            }

            System.out.print(sb.toString());

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}