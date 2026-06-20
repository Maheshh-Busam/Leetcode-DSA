// Last updated: 6/20/2026, 9:01:54 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        List<Integer> current = new ArrayList<>();
5
6        permutations(nums, result, current);
7
8        return result;
9
10    }
11
12    public void permutations(int[] nums, List<List<Integer>> result, List<Integer> current){
13
14        if(nums.length == current.size()){
15            List<Integer> permutations = new ArrayList<>(current);
16            result.add(permutations);
17            return;
18        }
19
20        for(int i = 0; i < nums.length; i++) {
21
22            if(current.contains(nums[i])){
23                continue;
24            }
25
26            current.add(nums[i]);
27
28            permutations(nums, result, current);
29
30            current.remove(current.size() - 1);
31        }
32    }
33}