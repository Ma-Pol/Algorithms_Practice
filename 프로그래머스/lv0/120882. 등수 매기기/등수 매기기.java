class Solution {
    public int[] solution(int[][] score) {
        int[] result = new int[score.length];
        double[] avg = new double[score.length];
        
        // 각 학생의 평균 점수를 저장(double형)
        for(int i = 0; i < score.length; i++)
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        
        // 각 학생의 평균 점수를 비교, 등수를 저장
        for(int i = 0; i < avg.length; i++) {
            int rank = 1;
            
            for(int j = 0; j < avg.length; j++)
                if(avg[i] < avg[j])
                    rank++;
            
            result[i] = rank;
        }
        
        return result;
    }
}