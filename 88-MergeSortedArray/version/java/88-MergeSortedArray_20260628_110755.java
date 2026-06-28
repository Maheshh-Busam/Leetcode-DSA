// Last updated: 6/28/2026, 11:07:55 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int p1 = m - 1;
4        int p2 = n - 1;
5        int p = m + n - 1;
6
7        while(p1 >= 0 && p2 >= 0){
8            if(nums1[p1] > nums2[p2]){
9                nums1[p] = nums1[p1];
10                p1--;
11            }
12            else {
13                nums1[p] = nums2[p2];
14                p2--;
15            }
16            p--;
17        }
18
19        while(p2 >= 0){
20            nums1[p] = nums2[p2];
21            p2--;
22            p--;
23        }
24
25    }
26}