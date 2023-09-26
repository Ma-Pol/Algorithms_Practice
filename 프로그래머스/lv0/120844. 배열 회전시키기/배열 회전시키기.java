class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] result = new int[length];
        
        if(direction.equals("right")){
            for(int i = 0; i < length - 1; i++)
                result[i + 1] = numbers[i];
                
            result[0] = numbers[length -1];
        } 
        else {
            for(int i = 0; i < length - 1; i++)
                result[i] = numbers[i + 1];
            
            result[length - 1] = numbers[0];
        }
        
        return result;
    }
}