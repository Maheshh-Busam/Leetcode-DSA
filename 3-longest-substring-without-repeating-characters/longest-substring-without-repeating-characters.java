class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0, end = 0;

        Set<Character> set = new HashSet<>();

        while(end < s.length()){
            char currChar = s.charAt(end);

            while(set.contains(currChar)){
                set.remove(s.charAt(start));
                start++;
            }

            set.add(currChar);
            
            int currLength = end - start + 1;
            maxLength = Math.max(maxLength, currLength);

            end++;
        }
        return maxLength;
    }
}