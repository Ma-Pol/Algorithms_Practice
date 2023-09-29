class Solution {
    public int solution(int num, int k) {
        String[] numStrArr = Integer.toString(num).split("");
        int result = -1;
        
        for(int i = 0; i < numStrArr.length; i++)
            if(Integer.parseInt(numStrArr[i]) == k && result == -1)
                result = i + 1;
        
        return result;
    }
}