// Last updated: 6/27/2026, 10:13:32 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if(s.length() > t.length()){
4            return false;
5        }
6
7        int start = 0;
8
9        for(int i = 0; i < s.length(); i++){
10            boolean found = false;
11
12            for(int j = start; j < t.length(); j++){
13                if(s.charAt(i) == t.charAt(j)){
14                    found = true;
15                    start = j + 1;
16                    break;
17                }
18            }
19            if(!found){
20                return false;
21            }
22        }
23        return true;
24    }
25}