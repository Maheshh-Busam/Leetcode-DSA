// Last updated: 6/28/2026, 12:46:21 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase();
4
5        int left = 0, right = s.length() - 1;
6
7        while(left <= right){
8            
9             while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
10                left++;
11            }
12            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
13                right--;
14            }
15
16            if(s.charAt(left) != s.charAt(right)){
17                return false;
18            }
19
20            left++;
21            right--;
22        }
23        
24        return true;
25    }
26}
27