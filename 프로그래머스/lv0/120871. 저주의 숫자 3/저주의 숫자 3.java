class Solution {
    public int solution(int n) {
        int result = 0, count = 1;
        
        while(true) {
            String num = Integer.toString(result);
            
            // 3의 배수이거나 3이 포함된 숫자인 경우 다음 숫자로 넘어감
            if(result % 3 == 0 || num.contains("3")) {
                result++;
                continue;
            }
            
            if(count++ == n)
                break;
            else
                result++;
        }
        
        return result;
    }
}