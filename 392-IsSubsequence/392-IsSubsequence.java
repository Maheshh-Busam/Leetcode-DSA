// Last updated: 6/27/2026, 10:16:12 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if(s.length() > t.length()){
4            return false;
5        }
6
7        int p1 = 0, p2 = 0;
8
9        while(p1 < s.length() && p2 < t.length()){
10
11            if(s.charAt(p1) == t.charAt(p2)){
12                p1++;
13            }
14            p2++;
15        }
16
17        if(p1 != s.length()){
18            return false;
19        }
20        return true;
21    }
22}