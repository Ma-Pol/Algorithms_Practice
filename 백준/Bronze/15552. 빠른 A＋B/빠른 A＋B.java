import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int cnt = Integer.parseInt(br.readLine());
		int c;
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			c = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			bw.write(c+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}