import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] times = (br.readLine()).split(" ");
		int h = Integer.parseInt(times[0]);
        int m = Integer.parseInt(times[1]);
        
        if(m - 45 < 0) {
            h = h == 0 ? 23 : h - 1;
        }
        
        m = m - 45 >= 0 ? m - 45 : m + 15; // 60 + m - 45 = m + 15
        
		System.out.print(new StringBuilder().append(h).append(" ").append(m).toString());

		br.close();
	}
}