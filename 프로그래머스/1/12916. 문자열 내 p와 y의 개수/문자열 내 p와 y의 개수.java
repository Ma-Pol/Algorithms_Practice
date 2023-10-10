class Solution {
    boolean solution(String s) {
        int pCount = 0, yCount = 0;
        
        for(char ch : s.toLowerCase().toCharArray())
            switch(ch) {
                case 'p':
                    pCount++;
                    break;
                case 'y':
                    yCount++;
                    break;
            }
        
        return pCount == yCount;
    }
}