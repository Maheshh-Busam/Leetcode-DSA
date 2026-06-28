// Last updated: 6/28/2026, 12:52:37 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5
6        int[] merged = new int[n + m];
7
8        int p1 = 0, p2 = 0;
9        int index = 0;
10
11        while(p1 < n && p2 < m){
12            if(nums1[p1] < nums2[p2]){
13                merged[index++] = nums1[p1++];
14            }
15            else {
16                merged[index++] = nums2[p2++];
17            }
18        }
19
20        while(p1 < n){
21            merged[index++] = nums1[p1++];      
22        }
23
24        while(p2 < m){
25            merged[index++] = nums2[p2++];
26        }
27
28        int mergedLen = merged.length;
29        double median = 0;
30
31        if(mergedLen % 2 == 0){
32            median = (merged[mergedLen/2] + merged[mergedLen/2 - 1]) / 2.0;
33        }
34        else {
35            median = merged[mergedLen/2];
36        }
37        return median;
38    }
39}