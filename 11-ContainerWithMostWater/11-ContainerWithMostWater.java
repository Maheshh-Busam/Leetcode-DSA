// Last updated: 6/27/2026, 9:59:45 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int containerWithMostWater = 0;
4        int left = 0, right = height.length - 1;
5
6        while(left <= right){
7
8            int width = right - left;
9            int currentContainer = width * Math.min(height[left], height[right]);
10
11            containerWithMostWater = Math.max(currentContainer, containerWithMostWater);
12
13            if(height[left] < height[right]){
14                left++;
15            }
16            else {
17                right--;
18            }
19        }
20
21        return containerWithMostWater;
22    }
23}