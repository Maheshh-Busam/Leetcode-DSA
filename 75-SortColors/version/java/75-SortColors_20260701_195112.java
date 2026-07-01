// Last updated: 7/1/2026, 7:51:12 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int zeros = 0;
4        int ones = 0;
5
6        for(int num : nums){
7            if(num == 0){
8                zeros++;
9            }
10            else if(num == 1){
11                ones++;
12            }
13        }
14
15        for(int i = 0; i < zeros; i++){
16            nums[i] = 0;
17        }
18
19        for(int i = zeros; i < zeros + ones; i++){
20            nums[i] = 1;
21
22        }
23
24        for(int i = zeros + ones; i < nums.length; i++){
25            nums[i] = 2;
26        }
27    }
28}