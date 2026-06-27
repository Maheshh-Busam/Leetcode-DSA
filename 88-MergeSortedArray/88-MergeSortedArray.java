// Last updated: 6/27/2026, 10:59:44 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int p1 = 0, p2 = 0;
4        int[] result = new int[nums1.length];
5        int index = 0;
6
7        while(p1 < m && p2 < n){
8            if(nums1[p1] <= nums2[p2]){
9                result[index++] = nums1[p1++];
10            }
11            else {
12                result[index++] = nums2[p2++];
13            }
14        }
15
16        while(p1 < m){
17            result[index++] = nums1[p1++];
18        }
19
20        while(p2 < n){
21            result[index++] = nums2[p2++];
22        }
23
24        for(int i = 0; i < result.length; i++){
25            nums1[i] = result[i];
26        }
27    }
28
29}