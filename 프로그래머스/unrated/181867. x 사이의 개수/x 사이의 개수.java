class Solution {
    public int[] solution(String myString) {
        String[] splited = myString.split("x");
        int[] result = new int[myString.endsWith("x") ? splited.length + 1 : splited.length];
        int idx = 0;
        
        for(String str : splited)
            result[idx++] = str.length();
        
        return result;
    }
}