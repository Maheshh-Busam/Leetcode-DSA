// Last updated: 6/27/2026, 2:10:24 PM
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
19        while(left <= right){
20            System.out.println(charArray[left]);
21            if(vowelsSet.contains(charArray[left]) && vowelsSet.contains(charArray[right])) {
22                char temp = charArray[left];
23                charArray[left] = charArray[right];
24                charArray[right] = temp;
25
26                System.out.println(charArray[left]);
27                System.out.println(charArray[right]);
28
29                left++;
30                right--;
31                
32            }
33            else if(!vowelsSet.contains(charArray[left])){
34                left++;
35            }
36            else if(!vowelsSet.contains(charArray[right])){
37                right--;
38            }
39        }
40
41        System.out.println(new String(charArray));
42
43        return new String(charArray);
44    }
45}