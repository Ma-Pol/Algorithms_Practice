import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
//      범위 1
//		1/1
        
//      범위 2
//		1/2
//		2/1
        
//      범위 3
//		3/1
//		2/2
//		1/3
        
//      범위 4
//		1/4
//		2/3
//		3/2
//		4/1
        
//      범위 5
//		5/1
//		4/2
//		3/3
//		2/4
//		1/5
//		
//		...
        
        int X = Integer.parseInt(br.readLine());
        int range = 0;
        
        // X번째 분수가 위치한 범위를 구함
        while(X > 0)
            X -= ++range;
        
        // 범위 내에서 X번째 분수의 위치를 구함
        X += range;
        
        // 짝수 범위의 경우 분자는 작은 값부터, 분모는 큰 값부터 시작
        // 홀수 범위의 경우는 반대
        if(range % 2 == 0)
            sb.append(X).append("/").append(range - (X - 1));
        else
            sb.append(range - (X - 1)).append("/").append(X);
        
        System.out.print(sb.toString());
        
        br.close();
    }
}