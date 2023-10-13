class Solution {
    public int solution(int[][] sizes) {
        int width = 0, height = 0;
        
        for(int[] size : sizes) {
            int thisWidth = Math.max(size[0], size[1]);
            int thisHeight = Math.min(size[0], size[1]);
            width = Math.max(width, thisWidth);
            height = Math.max(height, thisHeight);
        }
        
        return width * height;
    }
}