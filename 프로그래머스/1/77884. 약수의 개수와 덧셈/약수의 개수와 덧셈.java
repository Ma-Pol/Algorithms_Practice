class Solution {
    public int solution(int left, int right) {
        int result = 0;
        
        // 제곱수인 경우, 약수의 개수는 홀수 (Math.sqrt(i) % 1.0 != 0)
        // 제곱수가 아닌 경우, 약수의 개수는 짝수 (Math.sqrt(i) % 1.0 == 0)
        for(int i = left; i <= right; i++)
            result += i * (Math.sqrt(i) % 1.0 != 0 ? 1 : -1);
        
        return result;
    }
    
//     public int solution(int left, int right) {
//         int result = 0;
        
//         for(int i = left; i <= right; i++)
//             result += i * (isEven(i) ? 1 : -1);
        
//         return result;
//     }
    
//     // 약수의 개수를 구해 짝수면 true, 홀수면 false를 리턴
//     private boolean isEven(int num) {
//         int sqrt = (int) Math.sqrt(num);
//         int count = 0;
        
//         for(int i = 1; i <= sqrt; i++)
//             if(num % i == 0) {
//                 count++;
                
//                 if(num / i != 1 && num / i != sqrt)
//                     count++;
//             }
        
//         return count % 2 == 0;
//     }
}