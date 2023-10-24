import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int years = Integer.parseInt(br.readLine());
        int res = 0;

        if(years % 4 == 0 && (years % 100 != 0 || years % 400 == 0))
            res = 1;
        
		System.out.println(res);

		br.close();
	}
}