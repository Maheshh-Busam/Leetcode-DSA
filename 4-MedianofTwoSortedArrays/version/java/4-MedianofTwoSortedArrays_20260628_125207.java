// Last updated: 6/28/2026, 12:52:07 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5        
6        int[] merged = new int[m + n];
7        
8        for(int i = 0; i < nums1.length; i++){
9            merged[i] = nums1[i];
10        }
11
12        for(int i = 0; i < nums2.length; i++){
13            merged[n + i] = nums2[i];
14        }
15
16        Arrays.sort(merged);
17        int mergedLen = merged.length;
18
19        double median = 0;
20
21        if(mergedLen % 2 == 0){
22            median = (merged[mergedLen/2] + merged[mergedLen/2 - 1]) / 2.0;
23        }
24        else {
25            median = merged[mergedLen/2];
26        }
27
28        return median;
29    }
30}