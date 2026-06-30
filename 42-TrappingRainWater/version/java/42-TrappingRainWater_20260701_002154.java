// Last updated: 7/1/2026, 12:21:54 AM
1class Solution {
2    public int trap(int[] height) {
3        int left = 0, right = height.length - 1;
4        int leftMax = 0;
5        int rightMax = 0;
6        int maxArea = 0;
7
8        while(left <= right){
9            if(height[left] <= height[right]){
10                if(height[left] > leftMax){
11                    leftMax = height[left];
12                }
13                else{
14                    maxArea += leftMax - height[left];
15                }
16                left++;
17            }
18            else{
19                if(height[right] > rightMax){
20                    rightMax = height[right];
21                }
22                else{
23                    maxArea += rightMax - height[right];
24                }
25                right--;
26            }
27        }
28        return maxArea;
29    }
30}