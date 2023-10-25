import java.io.*;
//import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		int a = Integer.parseInt(st.nextToken());
		
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 1; i <= cnt; i++) {
			for (int j = 1; j <= cnt - i; j++) {
				bw.write(" ");
			}
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.newLine();;
		}
		bw.flush();
		br.close();
		bw.close();
	}

}