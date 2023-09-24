import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] result = new int[1000];
        int maxNum = -1, maxNTimes = 0;
        
        for(int i = 0; i < array.length; i++)
            result[array[i]]++;
        
        // j = 숫자
        // result[j] = 그 숫자가 나온 횟수
        // maxNum = 가장 많이 나온 숫자
        // maxNTimes = 가장 많이 나온 숫자의 나온 횟수
        for(int j = 0; j < result.length; j++) {
            if(result[j] > 0) {
                if(result[j] > maxNTimes) {
                    maxNum = j;
                    maxNTimes = result[j];
                } else if(result[j] == maxNTimes) {
                    maxNum = -1;
                }
            }
        }
        
        return maxNum;
        
    }
}