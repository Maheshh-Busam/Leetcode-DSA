// Last updated: 6/28/2026, 10:33:21 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int[] result = new int[nums.length];
4
5        int left = 0, right = nums.length - 1;
6        int index = nums.length - 1;
7
8        while(left <= right){
9            int leftSquare = nums[left] * nums[left];
10            int rightSquare = nums[right] * nums[right];
11
12            if(leftSquare > rightSquare){
13                result[index] = leftSquare;
14                left++;
15            }
16            else {
17                result[index] = rightSquare;
18                right--;
19            }
20            index--;
21        }
22        return result;
23    }
24}