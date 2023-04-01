class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int top = 0;
        int down = matrix.length - 1;
        boolean flag = false;
        if(top==down){
            int left = 0, right = matrix[down].length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (matrix[down][mid] == target) {
                    flag = true;
                    break;
                }
                if (matrix[down][mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }else{
        while (top < down) {
            if (matrix[down][0] > target) {
                down--;
            }
            if (matrix[top][matrix[top].length - 1] < target) {
                top++;
            }
            int left = 0, right = matrix[down].length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (matrix[down][mid] == target) {
                    flag = true;
                    break;
                }
                if (matrix[down][mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if(flag)break;
        }}
        return flag;
    }
}