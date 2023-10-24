import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] now = (br.readLine()).split(" ");
		int h = Integer.parseInt(now[0]);
        int m = Integer.parseInt(now[1]);
        
        int cookingTime = Integer.parseInt(br.readLine());
        
        m += cookingTime;
        
        h += m / 60;
        
        m %= 60;
        
        h %= 24;
        
		System.out.print(new StringBuilder().append(h).append(" ").append(m).toString());

		br.close();
	}
}