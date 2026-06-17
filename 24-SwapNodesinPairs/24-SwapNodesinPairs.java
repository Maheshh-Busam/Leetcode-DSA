// Last updated: 6/17/2026, 8:39:03 PM
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
13
14        if(head == null || head.next == null){
15            return head;
16        }
17
18        ListNode prev = null;
19        ListNode curr = head;
20        ListNode next = curr.next;
21
22        head = next;
23
24        while(curr != null && next != null){
25
26            ListNode nextPair = next.next;
27            curr.next = next.next;
28            next.next = curr;
29
30            if(prev != null){
31                prev.next = next;
32            }
33
34            prev = curr;
35
36            curr = nextPair;
37
38            if(curr != null){
39                next = curr.next;
40            }
41            else {
42                next = null;
43            }
44        }
45        return head;
46    }
47}