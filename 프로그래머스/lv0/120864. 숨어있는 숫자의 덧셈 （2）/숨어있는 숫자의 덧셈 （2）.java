class Solution {
    public int solution(String myString) {
        int result = 0;
        String[] strArr = myString.split("[a-zA-Z]");
        
        for(String str : strArr)
            if(!str.equals("")) result += Integer.parseInt(str);
        
        return result;
    }
}