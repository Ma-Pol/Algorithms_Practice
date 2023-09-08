class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = {-1, -1};
        HashMap<Integer, Integer> searchMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - first;

            if(searchMap.containsKey(second)) {
                res[0] = i;
                res[1] = searchMap.get(second);
                break;
            } else {
                searchMap.put(nums[i], i);
            }
        }

        return res;
    }
}