import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] charArr = new int[26];
		int maxRepeat = -1;
		int maxCharacter = -1;
		boolean isMultiple = false;

		char[] wordChar = (br.readLine()).toUpperCase().toCharArray();

		for(char ch : wordChar) {
			int charInt = (int) ch;
			charArr[charInt - 65]++;
		}

		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] > maxRepeat) {
				maxRepeat = charArr[i];
				maxCharacter = i;
				isMultiple = false;
			} else if(charArr[i] == maxRepeat) {
				isMultiple = true;
			}
		}

		System.out.print(isMultiple ? "?" : (char) (maxCharacter + 65));

		br.close();
	}
}