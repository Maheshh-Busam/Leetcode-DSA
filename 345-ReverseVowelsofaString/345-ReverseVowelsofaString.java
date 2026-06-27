// Last updated: 6/27/2026, 2:16:53 PM
1class Solution {
2    public String reverseVowels(String s) {
3        Set<Character> vowelsSet = new HashSet<>();
4        vowelsSet.add('a');
5        vowelsSet.add('e');
6        vowelsSet.add('i');
7        vowelsSet.add('o');
8        vowelsSet.add('u');
9        vowelsSet.add('A');
10        vowelsSet.add('E');
11        vowelsSet.add('I');
12        vowelsSet.add('O');
13        vowelsSet.add('U');
14
15        char[] charArray = s.toCharArray();
16
17        int left = 0, right = charArray.length - 1;
18
19        while (left <= right) {
20
21            while (left < right && !vowelsSet.contains(charArray[left])) {
22                left++;
23            }
24            while (left < right && !vowelsSet.contains(charArray[right])) {
25                right--;
26            }
27
28            char temp = charArray[left];
29            charArray[left] = charArray[right];
30            charArray[right] = temp;
31
32            left++;
33            right--;
34
35        }
36
37        return new String(charArray);
38    }
39}