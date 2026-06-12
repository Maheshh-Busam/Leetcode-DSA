class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        double median = 0;

        int[] merged = new int[n+m];

        for(int i = 0; i < n; i++){
            merged[i] = nums1[i];
        }

        for(int i = 0; i < m; i++){
            merged[n + i] = nums2[i];
        }

        Arrays.sort(merged);

        int mergedLength = merged.length;

        if(mergedLength % 2 == 0){
            median = (merged[mergedLength/2] + merged[mergedLength/2 - 1]) / 2.0;
        }
        else {
            median = merged[mergedLength/2];
        }

        return median;
    }
}