// Last updated: 6/18/2026, 8:06:24 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int left = 0, right = 0;
4
5        while(right < nums.length){
6            if(nums[right] != val){
7                nums[left] = nums[right];
8                left++;
9            }
10            right++;
11        }
12
13        return left;
14    }
15}