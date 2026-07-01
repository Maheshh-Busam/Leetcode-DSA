// Last updated: 7/1/2026, 11:08:30 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        Set<Integer> set = new LinkedHashSet<>();
4
5        for(int num : nums){
6            set.add(num);
7        }
8
9        int index = 0;
10        for(int num : set){
11            nums[index++] = num;
12        }
13
14        return set.size();
15    }
16}