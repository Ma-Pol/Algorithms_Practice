class Solution {
    public String[] solution(String[] names) {
        String[] result = new String[names.length / 5 + (names.length % 5 == 0 ? 0 : 1)];
        int idx = 0;
        
        for(int i = 0; i < names.length; i += 5)
            result[idx++] = names[i];
        
        return result;
    }
}