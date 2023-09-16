import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int result = 0;
        
        if(1 <= a && a <= 6 &&
          1 <= b && b <= 6 &&
          1 <= c && c <= 6 &&
          1 <= d && d <= 6) {
            int[] dice = { a, b, c, d };
            Arrays.sort(dice);
            
            // 정렬 시 경우의 수
            // 1. 네 숫자가 모두 같음: dice[0] == dice[3]
            // 2. 세 숫자가 같음: dice[0] == dice[2] || dice[1] == dice[3]
            // 3. 두 숫자와 두 숫자가 같음: dice[0] == dice[1] && dice[2] == dice[3]
            // 4. 두 숫자만 같음: dice[0] == dice[1] or dice[1] == dice[2] or dice[2] == dice[3]
            // 5. 모든 숫자가 다름: 1 ~ 4가 아님
            if (dice[0] == dice[3]) {
                result = 1111 * dice[3];
                
            } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
                // 많이 나온 수와 적게 나온 수 찾기
                // dice[1]과 dice[2]는 항상 많이 나온 수에 속한다.
                // dice[0] 또는 dice[3] 중 많이 나온 수와 적게 나온 수를 구분해야 한다.
                // => dice[0] + dice[3] 에서 많이 나온 수인 dice[1] 또는 dice[2]를 빼면 적게 나온 수를 찾을 수 있다.
                // => 10 * dice[1] + (dice[0] + dice[3] - dice[1]) ^ 2
                result = (int) Math.pow(
                    10 * dice[1] + (dice[0] + dice[3] - dice[1]), 2
                );
                
                
            } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
                // Math.abs() 로 절대값을 구하거나
                // 정렬되었음을 이용해 dice[3] - dice[0] 으로 항상 양수의 값을 구하기
                result = (dice[0] + dice[3]) * Math.abs(dice[0] - dice[3]);
                
            } else if (dice[0] == dice[1]) {
                result = dice[2] * dice[3];
                
            } else if (dice[1] == dice[2]) {
                result = dice[0] * dice[3];
                
            } else if (dice[2] == dice[3]) {
                result = dice[0] * dice[1];
                
            } else {
                result = dice[0];
            }
        }
        
        return result;
    }
}