import java.io.*;

/*
1은 무조건 엄지

2 이상의 값부터, 2를 빼고 아래 절차를 수행
1. 4로 나눈 값의 짝수/홀수 여부 판단
2. 4로 나눈 나머지 값을 계산
3-1. 짝수일 경우
        나머지 값 + 2
3-2. 홀수일 경우
        4 - 나머지 값
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()) - 2;
        int answer = 0;
        
        if(n == -1) {
            answer = 1;
        } else {
            if((n / 4) % 2 == 0) {
                answer = (n % 4) + 2;
            } else {
                answer = 4 - (n % 4);
            }
        }
        
        System.out.print(answer);
        
        br.close();
    }
}