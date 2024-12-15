class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while (true) {
            // 지폐를 돌리지 않은 상태에서 비교
            boolean isBillSmallerThanWalletNormal = wallet[0] >= bill[0] && wallet[1] >= bill[1];
            // 지폐를 돌린 상태에서 비교
            boolean isBillSmallerThanWalletRatated = wallet[0] >= bill[1] && wallet[1] >= bill[0];
            
            if (isBillSmallerThanWalletNormal || isBillSmallerThanWalletRatated) {
                break;
            }
            
            if (bill[0] >= bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++;
        }
        
        return answer;
    }
}