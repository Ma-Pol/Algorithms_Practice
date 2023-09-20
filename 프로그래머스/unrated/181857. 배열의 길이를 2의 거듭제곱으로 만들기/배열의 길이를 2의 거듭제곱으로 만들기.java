import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 2^0 = 1, 2^1 = 2, 2^2 = 4, ... ==> 1로 시작
        int length = 1;

        // 배열 길이가 length(현재 최소 2의 거듭제곱) 이하일 경우 종료
        while (length < arr.length)
            length *= 2;

        return Arrays.copyOf(arr, length);
    }
}