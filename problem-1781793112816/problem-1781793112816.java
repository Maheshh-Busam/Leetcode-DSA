// Last updated: 6/18/2026, 8:01:52 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        List<Integer> result = new ArrayList<>();
4
5        for(int num : nums){
6            if(num != val){
7                result.add(num);
8            }
9        }
10
11        int index = 0;
12        for(int num : result){
13            nums[index++] = num;
14        }
15
16        return result.size();
17    }
18}