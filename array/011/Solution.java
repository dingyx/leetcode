/**
 * 旋转图像
 *
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度
 * 必须在 原地 旋转图像
 */
class Solution {

    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int[] tempArray;
        int tempNum;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < 3; j++) {
                tempArray = matrix[i];
                matrix[i] = matrix[length - i - 1];
                matrix[length - i - 1] = tempArray;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                tempNum = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tempNum;
            }
        }
    }
}