// Last updated: 6/28/2026, 12:32:21 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> set = new HashSet();
4
5        for(int num : nums){
6            set.add(num);
7        }
8
9        if(set.size() < nums.length){
10            return true;
11        }
12
13        return false;
14    }
15}