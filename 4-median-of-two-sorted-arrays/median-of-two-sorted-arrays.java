class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];

        for(int i = 0; i < nums1.length; i++){
            merged[i] = nums1[i];
        }

        for(int i = 0 ; i < nums2.length; i++){
            merged[n + i] = nums2[i];
        }

        Arrays.sort(merged);

        int mergedLen = merged.length;
        double median = 0;

        if(mergedLen%2 == 0){
            median = (merged[mergedLen/2] + merged[mergedLen/2 - 1]) / 2.0;
        }
        else {
            median  = merged[mergedLen/2];
        }
        return median;
    }
}