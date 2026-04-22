class Solution {
    public boolean containsDuplicate(int[] nums) {
        // using hash set
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}