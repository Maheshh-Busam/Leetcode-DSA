// Last updated: 6/26/2026, 3:14:48 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0, right = height.length - 1;
4        int containerWithMostWater = 0;
5
6        while (left <= right) {
7            int width = right - left;
8            int currContainer = width * Math.min(height[left], height[right]);
9            containerWithMostWater = Math.max(currContainer, containerWithMostWater);
10
11            if (height[left] < height[right]) {
12                left++;
13            } else {
14                right--;
15            }
16        }
17        return containerWithMostWater;
18    }
19}