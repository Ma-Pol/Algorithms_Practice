import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] matrixSizes = (br.readLine()).split(" ");
        int N = Integer.parseInt(matrixSizes[0]);
        int M = Integer.parseInt(matrixSizes[1]);
        
        int[][] matrix = new int[N][M];
        
        // 1번 행렬
        for(int i = 0; i < N; i++) {
            String[] nums = (br.readLine()).split(" ");
            
            for(int j = 0; j < nums.length; j++) {
                matrix[i][j] = Integer.parseInt(nums[j]);
            }
        }
        
        // 행렬 덧셈
        for(int i = 0; i < N; i++) {
            String[] nums = (br.readLine()).split(" ");
            
            for(int j = 0; j < nums.length; j++) {
                matrix[i][j] += Integer.parseInt(nums[j]);
            }
        }
        
        for(int[] row : matrix) {
            for(int number : row)
                System.out.print(number + " ");
            System.out.println();
        }
        
		br.close();
	}
}