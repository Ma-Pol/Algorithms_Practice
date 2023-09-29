class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        int idx = 0;
        
        for(String mod : quiz) {
            String[] strArr = mod.split(" ");
            boolean res = false;
            
            int x = Integer.parseInt(strArr[0]);
            int y = Integer.parseInt(strArr[2]);
            int z = Integer.parseInt(strArr[4]);
            
            res = strArr[1].equals("+") ? x + y == z : x - y == z;
            
            result[idx++] = res ? "O" : "X";
        }
        
        return result;
    }
}