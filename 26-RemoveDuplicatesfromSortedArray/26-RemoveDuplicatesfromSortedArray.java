// Last updated: 6/17/2026, 9:03:03 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4        
5        if(n == 0){
6            return 0;
7        }
8
9        int left = 0, right = 0;
10
11        while(right < n){
12            nums[left] = nums[right];
13
14            while(right < n && nums[left] == nums[right]){
15                right++;
16            } 
17            left++;
18        }
19        return left;
20    }
21}