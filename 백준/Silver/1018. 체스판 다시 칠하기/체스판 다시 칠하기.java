import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] NM = Arrays.stream((br.readLine()).split(" "))
				.mapToInt(Integer::parseInt).toArray();
		boolean[][] board = new boolean[NM[0]][NM[1]];
		int minPaint = 64;

		for(int i = 0; i < board.length; i++) {
			char[] boardLine = (br.readLine()).toCharArray();
			int j = 0;

			for(char ch : boardLine)
				board[i][j++] = (ch == 'B');
		}

		for(int i = 0; i < NM[0] - 7; i++) {
			for(int j = 0; j < NM[1] - 7; j++) {
				int count = 0;
				boolean tempBool = board[i][j];

				for(int x = i; x < i + 8; x++) {
					for(int y = j; y < j + 8; y++) {
						if(board[x][y] != tempBool)
							count++;

						tempBool = !tempBool;
					}
					tempBool = !tempBool;
				}

				count = Math.min(count, 64 - count);
				minPaint = Math.min(minPaint, count);
			}
		}

		System.out.print(minPaint);

		br.close();
	}
}