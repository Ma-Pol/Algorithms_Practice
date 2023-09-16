class Solution {
    public String solution(String my_string, int[] index_list) {
        String result = "";
        
        if(1 <= my_string.length() && my_string.length() <= 1000 &&
          1 <= index_list.length && index_list.length <= 1000) {
            char[] ch_list = my_string.toCharArray();
            
            for(int i : index_list) {
                result += ch_list[i];
            }
        }
        
        return result;
    }
}