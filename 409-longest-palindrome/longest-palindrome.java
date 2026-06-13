class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;

        for(char c : map.keySet()){
            
            while(map.get(c) >= 2){
                map.put(c, map.get(c) - 2);
                count += 2;
            }
        }

        for(char c : map.keySet()){
            if(map.get(c) == 1){
                count += 1;
                break;
            }
        }
        return count;
    }
}