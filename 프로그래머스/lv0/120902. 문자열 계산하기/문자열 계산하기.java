class Solution {
    public int solution(String myString) {
        String[] strArr = myString.split(" ");
        int result = 0, op = 1;
        
        for(String str : strArr)
            if(str.equals("+") || str.equals("-"))
                op = str.equals("+") ? 1 : -1;
            else
                result += Integer.parseInt(str) * op;
        
        return result;
    }
}