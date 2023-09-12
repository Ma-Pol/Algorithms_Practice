class Solution {
    public int solution(int n, String control) {
        
        if(-100000 <= n && n <= 100000 && 
           1 <= control.length() && control.length() <= 100000) {
            loop:
            for(char ch : control.toCharArray()) {
                switch(ch) {
                    case 'w':
                        n += 1;
                        break;
                    case 's':
                        n -= 1;
                        break;
                    case 'd':
                        n += 10;
                        break;
                    case 'a':
                        n -= 10;
                        break;
                    default:
                        return 0;
                }
            }
        }
        
        return n;
    }
}