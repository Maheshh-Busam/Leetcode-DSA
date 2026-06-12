class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){

            Set<Character> set = new HashSet();

            for(int j = i; j < s.length(); j++){
                char currChar = s.charAt(j);
                if(set.contains(currChar)){
                    break;
                }
                set.add(currChar);
                maxLength = Math.max(maxLength, set.size());
            }

        }
        return maxLength;
    }
}