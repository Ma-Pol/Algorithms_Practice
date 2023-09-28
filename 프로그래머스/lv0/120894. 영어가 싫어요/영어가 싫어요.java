class Solution {
    public long solution(String numbers) {
        String[] numStrArr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        for(int i = 0; i < numStrArr.length; i++)
            numbers = numbers.replaceAll(numStrArr[i], Integer.toString(i));
        
        return Long.parseLong(numbers);
    }
}