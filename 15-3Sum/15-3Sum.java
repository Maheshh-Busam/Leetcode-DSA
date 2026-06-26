// Last updated: 6/26/2026, 11:50:19 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        Set<List<Integer>> set = new HashSet<>();
5
6        for(int i = 0; i < nums.length; i++){
7
8            int left = i + 1, right = nums.length - 1;
9
10            while(left < right){
11                int sum = nums[i] + nums[left] + nums[right];
12
13                if(sum == 0){
14                    List<Integer> current = new ArrayList<>();
15                    current.add(nums[i]);
16                    current.add(nums[left]);
17                    current.add(nums[right]);
18                    set.add(current);
19
20                    left++;
21                    right--;
22                }
23                else if(sum < 0){
24                    left++;
25                }
26                else {
27                    right--;
28                }
29            }
30
31        }
32
33        List<List<Integer>> result = new ArrayList<>();
34        
35        result.addAll(set);
36        return result;
37    }
38}