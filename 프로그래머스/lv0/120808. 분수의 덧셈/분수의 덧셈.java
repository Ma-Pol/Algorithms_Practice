class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1, 
            denom = denom1 * denom2;
        
        loop:
        while (true) {
            int min = numer > denom ? denom : numer;
        
            for (int i = 2; i <= min; i++)
                if (numer % i == 0 && denom % i == 0) {
                    numer /= i;
                    denom /= i;
                    continue loop;
                }
            
            break;
        }
        
        return new int[] {numer, denom};
    }
    
}