// Last updated: 6/28/2026, 12:48:07 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4
5        while(left <= right){
6            int mid = (left + right) / 2;
7
8            if(nums[mid] == target){
9                return mid;
10            }
11
12            if(nums[mid] < target){
13                left = mid + 1;
14            }
15            else {
16                right = mid - 1;
17            }
18        }
19        return -1;
20    }
21}