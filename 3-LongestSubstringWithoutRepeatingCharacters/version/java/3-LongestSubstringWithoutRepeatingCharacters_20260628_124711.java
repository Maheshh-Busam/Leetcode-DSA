// Last updated: 6/28/2026, 12:47:11 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int maxLength = 0;
4        int start = 0, end = 0;
5
6        Set<Character> set = new HashSet<>();
7
8        for(int i = 0; i < s.length(); i++){
9            char c = s.charAt(end);
10            
11            while(set.contains(c)){
12                set.remove(s.charAt(start));
13                start++;
14            }
15            set.add(c);
16
17            int currLength = end - start + 1;
18            maxLength = Math.max(maxLength, currLength);
19
20            end++;
21        }
22        return maxLength;
23    }
24}