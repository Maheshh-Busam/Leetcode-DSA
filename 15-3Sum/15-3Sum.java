// Last updated: 6/27/2026, 10:32:23 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5
6        for(int i = 0; i < nums.length; i++){
7
8            if(i > 0 && nums[i] == nums[i - 1]){
9                continue;
10            }
11
12            int left = i + 1, right = nums.length - 1;
13
14            while(left < right){
15                int sum = nums[i] + nums[left] + nums[right];
16
17                if(sum == 0){
18                    List<Integer> current = new ArrayList<>();
19                    current.add(nums[i]);
20                    current.add(nums[left]);
21                    current.add(nums[right]);
22
23                    result.add(current);
24
25                    while(left < right && nums[left] == nums[left + 1]){
26                        left++;
27                    }
28                    while(left < right && nums[right] == nums[right - 1]){
29                        right--;
30                    }
31
32                    left++;
33                    right--;
34                }
35                else if(sum < 0){
36                    left++;
37                }
38                else {
39                    right--;
40                }
41            }
42        }
43        return result;
44    }
45}