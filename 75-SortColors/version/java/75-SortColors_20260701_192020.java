// Last updated: 7/1/2026, 7:20:20 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4
5        for(int num : nums){
6            pq.add(num);
7        }
8
9        int index = 0;
10        while(!pq.isEmpty()){
11            nums[index++] = pq.poll();
12        }
13    }
14}