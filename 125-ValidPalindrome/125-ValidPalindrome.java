// Last updated: 6/27/2026, 12:25:42 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase();
4        int left = 0, right = s.length() - 1;
5
6        while(left <= right){
7
8            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
9                left++;
10            }
11            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
12                right--;
13            }
14
15            if(s.charAt(left) != s.charAt(right)){
16                return false;
17            }
18            left++;
19            right--;
20        }
21
22        return true;
23    }
24}