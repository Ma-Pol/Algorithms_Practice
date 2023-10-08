class Solution {
    public int solution(String A, String B) {
//         String nextA = A;
        
//         for(int i = 0; i < A.length(); i++) {
//             if(nextA.equals(B)) return i;
            
//             String pre = nextA.substring(nextA.length() - 1); // 마지막 글자 자르기
//             nextA = pre + nextA.substring(0, nextA.length() - 1); // 마지막 글자 + 나머지 글자
//         }
        
//         return -1;
        
        // 2회 반복 후 A와 일치하는 문자열의 시작 인덱스를 출력(없으면 -1 출력)
        String tempB = B.repeat(2);
        return tempB.indexOf(A);
    }
}