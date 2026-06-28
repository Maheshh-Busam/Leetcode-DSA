// Last updated: 6/28/2026, 12:47:48 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4
5        for(char c : s.toCharArray()){
6            if(c == '(' || c == '[' || c == '{'){
7                stack.push(c);
8            }
9            else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
10                stack.pop();
11            }
12            else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
13                stack.pop();
14            }
15            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
16                stack.pop();
17            }
18            else {
19                return false;
20            }
21        }
22        return stack.isEmpty();
23    }
24}