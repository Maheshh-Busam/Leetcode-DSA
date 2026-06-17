// Last updated: 6/17/2026, 9:01:30 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        
4        int n = nums.length;
5        if(n == 0){
6            return 0;
7        }
8
9        Set<Integer> set = new LinkedHashSet();
10
11        for(int num : nums){
12            set.add(num);
13        }
14
15        int index = 0;
16
17        for(int num : set){
18            nums[index++] = num;
19        }
20
21        return set.size();
22    }
23}