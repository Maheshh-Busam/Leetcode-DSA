// Last updated: 6/18/2026, 8:52:30 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int left1 = 0, right1 = nums.length - 1;
4        int[] result = new int[]{-1,-1};
5
6        while(left1 <= right1){
7            int mid = (left1 + right1) / 2;
8
9            if(nums[mid] == target) {
10                result[0] = mid;
11                right1 = mid - 1;
12            }
13            else if(nums[mid] < target){
14                left1 = mid + 1;
15            }
16            else {
17                right1 = mid - 1;
18            }
19        }
20
21        int left2 = 0, right2 = nums.length - 1;
22
23        while(left2 <= right2){
24            int mid = (left2 + right2)/2;
25
26            if(nums[mid] == target){
27                result[1] = mid;
28                left2 = mid + 1;
29            }
30            else if(nums[mid] < target){
31                left2 = mid + 1;
32            }
33            else {
34                right2 = mid - 1;
35            }
36        }
37        return result;
38    }
39}