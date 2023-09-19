class Solution {
    public int solution(int[] nList) {
        int odd = 0, even = 0, idx = 1;
        
        for(int x : nList) {
            even = idx % 2 == 0 ? even + x : even;
            odd = idx % 2 == 1 ? odd + x : odd;
            idx++;
        }
        
        return even > odd ? even : odd;
    }
}