// Last updated: 6/19/2026, 3:46:31 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int index = -1;
4
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] == target){
7                index = i;
8                break;
9            }
10            else if(nums[i] > target){
11                index = i;
12                break;
13            }
14        }
15
16        if(index == -1){
17            return nums.length;
18        }
19        
20        return index;
21    }
22}