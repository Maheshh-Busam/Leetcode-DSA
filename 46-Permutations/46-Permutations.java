// Last updated: 6/22/2026, 11:05:51 AM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result =new ArrayList<>();
4        List<Integer> current = new ArrayList<>();
5
6        permutations(nums, result, current);
7
8        return result;
9    }
10
11    public void permutations(int[] nums, List<List<Integer>> result, List<Integer> current) {
12
13        if(nums.length == current.size()){
14            List<Integer> permutations = new ArrayList<>(current);
15            result.add(permutations);
16            return;
17        }
18
19        for(int i = 0; i < nums.length; i++){
20
21            if(current.contains(nums[i])){
22                continue;
23            }
24
25            current.add(nums[i]);
26
27            permutations(nums, result, current);
28
29            current.remove(current.size() - 1);
30        }
31    }
32}