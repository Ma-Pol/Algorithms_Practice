class Solution {
    public int solution(String myString, String isPrefix) {
        // 이전번 endsWith()에 이어서 이번엔 startsWith()
        return myString.startsWith(isPrefix) ? 1 : 0;
    }
}