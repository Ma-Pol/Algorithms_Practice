class Solution {
    public int solution(String myString, String pat) {
        String reverse = "";
        
        for(char ch : myString.toCharArray())
            reverse += ch == 'A' ? "B" : "A";
        
        return reverse.contains(pat) ? 1 : 0;
    }
}