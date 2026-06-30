// Last updated: 6/30/2026, 11:34:00 PM
1class Solution {
2    public int trap(int[] height) {
3        int maxArea = 0;
4
5        int[] leftMax = prefixMax(height);
6        int[] rightMax = suffixMax(height);
7
8        for(int i = 0; i < height.length; i++){
9            maxArea += Math.min(leftMax[i], rightMax[i]) - height[i];
10        }
11
12        return maxArea;
13    }
14
15    public int[] prefixMax(int[] height){
16        int[] prefix = new int[height.length];
17        prefix[0] = height[0];
18
19        for(int i = 1; i < height.length; i++){
20            prefix[i] = Math.max(prefix[i - 1], height[i]);
21        }
22        return prefix;
23    }
24
25    public int[] suffixMax(int[] height){
26        int[] suffix = new int[height.length];
27        suffix[height.length - 1] = height[height.length - 1];
28
29        for(int i = height.length - 2; i >= 0; i--){
30            suffix[i] = Math.max(suffix[i + 1], height[i]);
31        }
32        return suffix;
33    }
34}