// Last updated: 6/28/2026, 11:10:14 AM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if (s.length() > t.length()) {
4            return false;
5        }
6
7        int p1 = 0, p2 = 0;
8
9        while(p1 < s.length() && p2 < t.length()){
10            if(s.charAt(p1) == t.charAt(p2)){
11                p1++;
12            }
13            p2++;
14        }
15        
16        if(p1 != s.length()){
17            return false;
18        }
19        return true;
20    }
21}