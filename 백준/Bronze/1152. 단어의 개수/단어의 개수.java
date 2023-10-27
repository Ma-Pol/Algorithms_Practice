import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String sentence = (br.readLine()).strip();
        String[] words = sentence.split(" ");

		System.out.print(sentence.equals("") ? 0 : words.length);

		br.close();
	}
}