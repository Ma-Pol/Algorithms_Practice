import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        String[] num2 = (br.readLine()).split("");
        
        int num3 = 0, num4 = 0, num5 = 0;
        
        for(String num : num2) {
            int res = num1 * Integer.parseInt(num);
            
            if(num5 == 0) {
                num5 = res;
            } else if(num4 == 0) {
                num4 = res;
            } else {
                num3 = res;
            }
        }
        
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num3 + num4 * 10 + num5 * 100);

		br.close();
	}
}