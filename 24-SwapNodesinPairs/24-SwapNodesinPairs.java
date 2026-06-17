// Last updated: 6/17/2026, 8:31:13 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13        ListNode temp = head;
14        int length = 0;
15
16        while(temp != null){
17            temp = temp.next;
18            length++;
19        }
20
21        if(length <= 1){
22            return head;
23        }
24        
25        ListNode prev = null;
26        ListNode curr = head;
27        ListNode next = curr.next;
28
29        head = next;
30
31        while(curr != null && next != null){
32           
33           ListNode nextPair = next.next;
34
35           curr.next = next.next;
36           next.next = curr;
37
38           if(prev != null){
39                prev.next = next;
40           }
41
42           prev = curr;
43           curr = nextPair;
44
45           if(curr != null){
46                next = curr.next;
47           }
48           else {
49            next = null;
50           }
51        
52        }
53        return head;
54        
55    }
56}