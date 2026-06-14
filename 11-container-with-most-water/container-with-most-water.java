class Solution {
    public int maxArea(int[] height) {
        int p1 = 0, p2 = height.length - 1;
        int maxWater = 0;

        while(p1 < p2){
            int width = p2 - p1;
            int currWater = width * Math.min(height[p1], height[p2]);

            maxWater = Math.max(currWater, maxWater);

            if(height[p1] < height[p2]){
                p1++;
            }
            else {
                p2--;
            }
        }
        return maxWater;
    }
}