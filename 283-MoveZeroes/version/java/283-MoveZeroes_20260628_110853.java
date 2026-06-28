// Last updated: 6/28/2026, 11:08:53 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int[] result = new int[nums.length];
4        int index = 0;
5
6        for(int num : nums){
7            if(num != 0){
8                result[index++] = num;
9            }
10        }
11
12        while(index < result.length){
13            result[index++] = 0;
14        }
15
16        for(int i = 0 ; i < result.length; i++){
17            nums[i] = result[i];
18        }
19    }
20}