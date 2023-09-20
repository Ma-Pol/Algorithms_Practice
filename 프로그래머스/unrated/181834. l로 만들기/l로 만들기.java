class Solution {
    public String solution(String myString) {
        // 정규식 [^l-z] : l ~ z 사이의 범위가 아닌(^) 것을 모두 선택
        return myString.replaceAll("[^l-z]", "l");
    }
}