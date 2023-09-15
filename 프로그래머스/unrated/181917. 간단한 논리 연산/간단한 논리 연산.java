class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // \/: or 연산
        // /\: and 연산
        // (x1 | x2) & (x3 | x4) 구하기
        return (x1 | x2) & (x3 | x4);
    }
}