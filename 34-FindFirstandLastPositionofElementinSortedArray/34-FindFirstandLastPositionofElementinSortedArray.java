// Last updated: 6/18/2026, 8:47:17 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4        int[] result = new int[]{-1,-1};
5
6        while(left  < nums.length){
7            if(nums[left] == target){
8                result[0] = left;
9                break;
10            }
11            left++;
12        }
13
14        while(right >= 0) {
15            if(nums[right] == target){
16                result[1] = right;
17                break;
18            }
19            right--;
20        }
21        return result;
22    }
23}