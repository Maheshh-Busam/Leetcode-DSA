// Last updated: 6/28/2026, 11:06:29 AM
1class Solution {
2    public int maxArea(int[] heights) {
3        int left = 0, right = heights.length - 1;
4        int mostWaterContainer = 0;
5
6        while(left <= right){
7
8            int width = right - left;
9            int currentContainer = width * Math.min(heights[left], heights[right]);
10
11            mostWaterContainer = Math.max(currentContainer, mostWaterContainer);
12
13            if(heights[left] < heights[right]){
14                left++;
15            }
16            else {
17                right--;
18            }
19
20
21        }
22        return mostWaterContainer;
23    }
24}
25