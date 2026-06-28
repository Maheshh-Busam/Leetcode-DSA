// Last updated: 6/28/2026, 12:51:12 PM
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
12            if(nums[left] <= nums[mid]){
13                if(nums[left] <= target && target <= nums[mid]){
14                    right = mid - 1;
15                }
16                else {
17                    left = mid + 1;
18                }
19            }
20            else {
21                if(nums[mid] <= target && target <= nums[right]){
22                    left = mid + 1;
23                }
24                else {
25                    right = mid - 1;
26                }
27            }
28        }
29        
30        return -1;
31    }
32}