class Solution {
    public String[] solution(String[] picture, int k) {
        String[] result = new String[picture.length * k];
        int idx = 0;
        
        for(String pic : picture) {
            String str = "";
            
            for(char ch : pic.toCharArray())
                for(int i = 0; i < k; i++)
                    str += ch;
            
            for(int i = 0; i < k; i++) 
                result[idx++] = str;
        }
        
        return result;
    }
}