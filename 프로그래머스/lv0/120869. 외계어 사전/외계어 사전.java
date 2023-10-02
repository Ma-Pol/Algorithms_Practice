class Solution {
    public int solution(String[] spell, String[] dic) {
        int result = 2;
        
        loop:
        for(String str : dic) {
            if(str.length() != spell.length) continue;
            
            for(int i = 0; i < spell.length; i++) {
                str = str.replaceFirst(spell[i], "");
                
                if(str.length() == 0 && i == spell.length - 1) {
                    result = 1;
                    break loop;
                }
                
                if(str.length() == 0 && i != spell.length - 1)
                    break;
            }
        }
        
        return result;
        // 4, 5번 케이스는 2가 출력되어야 하는데 1이 출력되는 상황
        // 다른 건 문제 없음
    }
}