class Solution {
    
    private char[] ch_arr;
    
    public String solution(String my_string, int[][] queries) {
        
        if(1 <= my_string.length() && my_string.length() <= 1000 &&
          1 <= queries.length && queries.length <= 1000) {
            
            ch_arr = my_string.toCharArray();
            
            for(int[] query : queries)
                reverse(query[0], query[1]);
        }
        
        return new String(ch_arr);
    }
    
    private void reverse(int s, int e) {
        while(s < e) {
            char temp = ch_arr[s];
            ch_arr[s++] = ch_arr[e];
            ch_arr[e--] = temp;
        }
    }
}