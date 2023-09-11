class Solution {
    public int solution(int a, int b) {
        int result = 0;
        String ab = "", ba = "";
        
        if((1 <= a && a <= 10000) && (1 <= b && b <= 10000)) {
            ab += "" + a + b;
            ba += "" + b + a;
            if(Integer.parseInt(ab) >= Integer.parseInt(ba)) {
                result = Integer.parseInt(ab);
            } else {
                result = Integer.parseInt(ba);
            }
        }
        
        return result;
    }
}