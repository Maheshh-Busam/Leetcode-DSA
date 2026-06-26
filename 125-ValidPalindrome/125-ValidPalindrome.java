// Last updated: 6/27/2026, 12:17:55 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase();
4        StringBuilder sb = new StringBuilder();
5
6        for(char c : s.toCharArray()){
7            if(Character.isLetterOrDigit(c)){
8                sb.append(c);
9            }
10        }
11
12        return isPalindrome(sb);
13    }
14
15    public boolean isPalindrome(StringBuilder sb){
16        int left = 0, right = sb.length() - 1;
17
18        while(left <= right){
19            if(sb.charAt(left) != sb.charAt(right)){
20                return false;
21            }
22            left++;
23            right--;
24        }
25        return true;
26    }
27}