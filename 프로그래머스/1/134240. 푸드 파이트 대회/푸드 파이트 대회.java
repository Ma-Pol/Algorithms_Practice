class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for(int i = 1; i < food.length; i++)
            left.append(Integer.toString(i).repeat(food[i] / 2));
        
        result.append(left.toString());
        
        result.append("0");
        
        result.append(left.reverse().toString());
        
        return result.toString();
    }
}