class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];

        int p1 = 0, p2 = 0;
        int index = 0;

        while(p1 < n && p2 < m){
            if(nums1[p1] < nums2[p2]){
                merged[index++] = nums1[p1++]; 
            }
            else {
                merged[index++] = nums2[p2++];
            }
        }

        while(p1 < n){
            merged[index++] = nums1[p1++];
        }

        while(p2 < m){
            merged[index++] = nums2[p2++];
        }

        int mergedLength = merged.length;

        double median = 0;

        if(mergedLength % 2 == 0){
            median = (merged[mergedLength/2] + merged[mergedLength/2 - 1]) / 2.0;
        }
        else {
            median = merged[mergedLength/2];
        }

        return median;
    }
}