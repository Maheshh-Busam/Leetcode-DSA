class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0, end = 0;

        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(end);
            
            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);

            int currLength = end - start + 1;
            maxLength = Math.max(maxLength, currLength);

            end++;
        }
        return maxLength;
    }
}