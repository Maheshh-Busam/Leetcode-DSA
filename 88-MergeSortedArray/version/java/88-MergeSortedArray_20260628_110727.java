// Last updated: 6/28/2026, 11:07:27 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int[] result = new int[nums1.length];
4
5       int p1 = 0, p2 = 0;
6       int index = 0;
7
8       while(p1 < m && p2 < n){
9            if(nums1[p1] <= nums2[p2]){
10                result[index++] = nums1[p1++];
11            }
12            else if(nums2[p2] < nums1[p1]){
13                result[index++] = nums2[p2++];
14            }
15
16       }
17
18       while(p1 < m){
19        result[index++] = nums1[p1++];
20       }
21
22       while(p2 < n){
23        result[index++] = nums2[p2++];
24       }
25
26       for(int i = 0; i < result.length; i++){
27            nums1[i] = result[i];
28       }
29
30    }
31}