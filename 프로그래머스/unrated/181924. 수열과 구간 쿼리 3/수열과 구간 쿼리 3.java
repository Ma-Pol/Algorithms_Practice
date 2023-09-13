class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        if(1 <= arr.length && arr.length <= 1000 &&
          1 <= queries.length && queries.length <= 1000) {
            for(int[] query : queries) {
                int temp = arr[query[0]];
                arr[query[0]] = arr[query[1]];
                arr[query[1]] = temp;
            }
        }
        
        return arr;
    }
}