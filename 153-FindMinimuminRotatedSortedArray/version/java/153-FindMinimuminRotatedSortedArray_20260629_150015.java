// Last updated: 6/29/2026, 3:00:15 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int min = Integer.MAX_VALUE;
4
5        for(int num : nums){
6            if(num < min){
7                min = num;
8            }
9        }
10
11        return min;
12    }
13}