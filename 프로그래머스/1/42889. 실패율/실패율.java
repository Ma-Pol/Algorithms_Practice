import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // stageData[i][0] : 스테이지 번호
        // stageData[i][1] : 스테이지 실패율
        double[][] stageData = new double[N][2];
        int[] result = new int[N];
        
        for(int i = 0; i < N; i++) {
            double fails = 0.0;
            double users = 0.0;
            
            for(int j = 0; j < stages.length; j++) {
                if(i + 1 == stages[j])
                    fails++;
                
                if(i + 1 <= stages[j])
                    users++;
            }
            
            stageData[i][0] = i + 1;
            stageData[i][1] = users != 0.0 ? (fails / users) : 0.0;
        }
        
        Arrays.sort(stageData, (stage1, stage2) -> {
            // 실패율 기준 내림차순 정렬
            // 실패율이 같을 경우 스테이지 번호 기준 오름차순 정렬
            if(stage1[1] == stage2[1])
                return Double.compare(stage1[0], stage2[0]);
            else
                return Double.compare(stage2[1], stage1[1]);
        });
        
        for(int k = 0; k < N; k++)
            result[k] = (int) stageData[k][0];
        
        return result;
    }
}