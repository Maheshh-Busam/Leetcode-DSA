// Last updated: 6/28/2026, 10:20:35 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        
4        for(int i = 0; i < nums.length; i++){
5            nums[i] = nums[i] * nums[i];
6        }
7
8        Arrays.sort(nums);
9
10        return nums;
11    }
12}