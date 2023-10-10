class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        
        return new StringBuilder("*".repeat(length - 4)).append(phone_number.substring(length - 4)).toString();
    }
}