// Last updated: 6/29/2026, 3:02:10 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0, right = nums.length - 1;
4
5        while(left < right){
6            int mid = (left + right)/2;
7
8            if(nums[mid] > nums[right]){
9                left = mid + 1;
10            }
11            else {
12                right = mid;
13            }
14        }
15        return nums[left];
16    }
17}