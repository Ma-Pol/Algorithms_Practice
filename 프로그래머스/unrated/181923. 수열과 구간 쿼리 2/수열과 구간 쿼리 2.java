class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        
        if(1 <= arr.length && arr.length <= 1000 &&
          1 <= queries.length && queries.length <= 1000) {
            
            int cnt = 0; // result 인덱스
            
            for(int[] query : queries) {
                int value = -1; // 시작값
                int k = query[2]; // k값
                
                for(int i = query[0]; i <= query[1]; i++) {
                    
                    // 1. 현재 arr 원소 값이 k보다 크고,
                    // 2-1. 아직 최소값을 찾지 못했거나
                    // 2-2. 현재 arr 원소 값이 최소값보다 작은 경우
                    // 3. 최소값을 현재 arr 원소 값으로 변경
                    // 4. k보다 큰 값이 존재하지 않으면 temp는 -1을 유지
                    if(arr[i] > k && (value == -1 || arr[i] < value)) {
                        value = arr[i];
                    }
                    
                }
                
                result[cnt] = value;
                
                cnt++;
            }
            
        }
        
        return result;
    }
}