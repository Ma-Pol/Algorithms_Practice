class Solution {
    
    private int count = 0;
    
    public int solution(int num) {
        collatz(num);
        
        return count < 500 ? count : -1;
    }
    
    private void collatz(long num) {
        if(num == 1 || count == 500) return;
        
        if(num % 2 == 0) collatz(num / 2l);
        else collatz(num * 3l + 1l);
        
        this.count++;
    }
}