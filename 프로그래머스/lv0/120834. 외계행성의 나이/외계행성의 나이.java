class Solution {
    public String solution(int age) {
        String result = "";
        String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

        while(age > 0){
            result = arr[age % 10] + result;
            age /= 10;
        }

        return result;
    }
}