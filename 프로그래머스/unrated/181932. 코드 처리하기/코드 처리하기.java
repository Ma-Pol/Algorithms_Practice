class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        if(1 <= code.length() && code.length() <= 100000) {
            for(int i = 0; i < code.length(); i++) {
                char ch = code.charAt(i);
                
                // 예외 체크
                if(ch != '1' && (97 > ch || ch > 122)) {
                    ret = "EMPTY";
                    break;
                }
                
                // 1 체크
                if(ch == '1') {
                    mode = mode == 1 ? 0 : 1;
                    continue;
                }
                
                // 문자 추가
                // mode == 0 이면 i % 2 == 0 일 때 추가
                // mode == 1 이면 i % 2 == 1 일 때 추가
                // 즉, i % 2 == mode 일 때 추가
                if(i % 2 == mode) {
                    ret += ch;
                }
                
            }
        }
        
        return ret.equals("") ? "EMPTY" : ret;
    }
}