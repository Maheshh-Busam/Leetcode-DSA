// Last updated: 6/28/2026, 12:48:45 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        for(int i = 0; i < matrix.length; i++){
4            for(int j = 0; j < matrix[0].length; j++){
5                if(matrix[i][j] == target){
6                    return true;
7                }
8            }
9        }
10        return false;
11    }
12}