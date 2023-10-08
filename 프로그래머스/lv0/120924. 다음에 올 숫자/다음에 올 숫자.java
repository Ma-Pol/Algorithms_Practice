class Solution {
    public int solution(int[] common) {
        int last = common.length - 1;
        
        // 등차수열인가 확인
        return common[2] - common[1] == common[1] - common[0] ? 
                common[last] + (common[last] - common[last - 1]) :
                common[last] * (common[last] / common[last - 1]);
    }
}