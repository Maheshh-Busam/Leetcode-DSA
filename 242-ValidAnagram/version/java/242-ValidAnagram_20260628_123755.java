// Last updated: 6/28/2026, 12:37:55 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()){
4            return false;
5        }
6
7        HashMap<Character, Integer> map = new HashMap<>(); 
8
9        for(char c : s.toCharArray()){ 
10            map.put(c, map.getOrDefault(c, 0) + 1);
11        }
12
13        for(char c : t.toCharArray()){
14            if(!map.containsKey(c)){
15                return false;
16            }
17            map.put(c, (map.get(c) - 1));
18
19            if(map.get(c) == 0){
20                map.remove(c);
21            }
22        }
23        return map.isEmpty();
24    }
25}