import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        PriorityQueue<Integer> honer = new PriorityQueue<>(); // 우선순위 큐
        
        for(int i = 0; i < score.length; i++) {
            honer.add(score[i]);
            
            if (honer.size() > k)
                honer.remove();

            result[i] = honer.peek();
        }



        return result;
    }
}