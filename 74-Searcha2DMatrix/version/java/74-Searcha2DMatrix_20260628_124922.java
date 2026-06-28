// Last updated: 6/28/2026, 12:49:22 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int rowsLength = matrix.length;
4        int colsLength = matrix[0].length;
5
6        int left = 0, right = rowsLength * colsLength - 1;
7
8        while(left <= right) {
9            int mid = (left + right) / 2;
10
11            int value = matrix[mid/colsLength][mid%colsLength];
12
13            if(value == target){
14                return true;
15            }
16
17            if(value < target){
18                left = mid + 1;
19            }
20            else {
21                right = mid - 1;
22            }
23        }
24        return false;
25    }
26}