import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> result = new ArrayList<>();
        
        // 문자열의 길이가 0이 될 때까지 반복
        while(s.length() != 0) {
            // 첫 번째 문자를 지운 뒤의 문자열 길이가 기존 길이 - 1과 같다면 헤당 문자는 한 번만 등장한 것임을 이용
            String target = s.substring(0, 1);
            int tempLength = s.length();
            
            s = s.replace(target, "");
            
            if(s.length() == tempLength - 1)
                result.add(target);
        }
        
        Collections.sort(result);
        
        return String.join("", result);
    }
}