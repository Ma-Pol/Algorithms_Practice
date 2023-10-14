class Solution {
    public int solution(int n) {
        // Integer.toString(n, 3) 으로 3진법 변환
        // new StringBuilder(3진법) 으로 StringBuilder 객체 생성
        // .reverse() 로 3진법 뒤집기
        // .toString() 으로 문자열 변환
        // Integer.parseInt(뒤집은 3진법, 3) 으로 10진법 변환
        return Integer.parseInt(new StringBuilder(Integer.toString(n, 3)).reverse().toString(), 3);
    }
}