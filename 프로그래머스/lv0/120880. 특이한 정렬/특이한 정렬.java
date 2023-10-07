class Solution {
    public int[] solution(int[] numlist, int n) {
        
        for(int i = numlist.length; i > 0; i--)
            for(int j = 0; j < i - 1; j++) {
                int thisNum = numlist[j] - n;
                int nextNum = numlist[j + 1] - n;
                
                int thisNumAbs = Math.abs(thisNum);
                int nextNumAbs = Math.abs(nextNum);
                
                if(thisNumAbs > nextNumAbs || (thisNumAbs == nextNumAbs && thisNum < nextNum)) {
                    
                    int temp = numlist[j];
                    numlist[j] = numlist[j + 1];
                    numlist[j + 1] = temp;
                    
                }
            }
        
        
        return numlist;
    }
}