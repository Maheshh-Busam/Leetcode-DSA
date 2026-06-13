class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        boolean hasOdd = false;

        for(char c : map.keySet()){
            if(map.get(c) % 2 == 0){
                count += map.get(c);
            }
            else {
                count += map.get(c) - 1;
                hasOdd = true;
            }
        }
        if(hasOdd){
            count += 1;
        }

        return count;
    }
}