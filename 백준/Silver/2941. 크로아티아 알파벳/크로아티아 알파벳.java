import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = (br.readLine()).replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", " ");

		System.out.print(word.length());

		br.close();
	}
}