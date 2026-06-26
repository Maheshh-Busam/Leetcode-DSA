// Last updated: 6/27/2026, 12:04:08 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5
6        for(int i = 0; i < nums.length - 2; i++){
7            int left = i + 1, right = nums.length - 1;
8            if(i > 0 && nums[i] == nums[i - 1]){
9                continue;
10            }
11
12            while(left < right){
13                int sum = nums[i] + nums[left] + nums[right];
14
15                if(sum == 0){
16                    List<Integer> current = new ArrayList<>();
17                    current.add(nums[i]);
18                    current.add(nums[left]);
19                    current.add(nums[right]);
20                    result.add(current);
21
22                    while(left < right && nums[left] == nums[left + 1]){
23                        left++;
24                    }
25                    while(left < right && nums[right] == nums[right - 1]){
26                        right--;
27                    }
28
29                    left++;
30                    right--;
31                }
32                else if(sum < 0){
33                    left++;
34                }
35                else {
36                    right--;
37                }
38            }
39        }
40
41        return result;
42    }
43}