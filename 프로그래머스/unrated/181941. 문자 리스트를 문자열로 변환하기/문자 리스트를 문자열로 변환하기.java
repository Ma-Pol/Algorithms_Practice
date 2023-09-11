class Solution {
    public String solution(String[] arr) {
        String result = "";
        
        if(1 <= arr.length && arr.length <= 200) {
            // foreach
            // for(String str : arr) {
            //     result += str;
            // }
            
            // String.join
            result += String.join("", arr);
        }
        
        return result;
    }
}