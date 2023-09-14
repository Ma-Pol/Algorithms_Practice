import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] result = { -1 };
        
        if(1 <= l && l <= r && r <= 1000000) {
            int[] arr = new int[0]; // 현재 배열
            int cnt = 0; // 현재 인덱스
            
            // 숫자 순회
            for(int i = l; i <= r; i++) {
                String sNumber = Integer.toString(i); // 현재 숫자(문자열)
                boolean check = true;
                
                // 현재 숫자 각 자리수 검사
                for(char ch : sNumber.toCharArray()) {
                    // 5도 0도 아닌 숫자가 하나라도 있다면 check = true
                    if(ch != '0' && ch != '5') {
                        check = false;
                        break;
                    }
                }
                
                // 0과 5로만 이루어진 숫자일 때만 배열에 추가
                if(check) {
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[cnt] = i;
                    cnt++;
                }
            }
            
            // 모든 숫자를 순회하고 난 뒤, result에 배열 복사(하나라도 있을 경우만)
            if(arr.length != 0) {
                result = Arrays.copyOf(arr, arr.length);
            }
        }
        
        return result;
    }
}