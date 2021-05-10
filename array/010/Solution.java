import java.util.HashSet;

/**
 * 有效的数独
 *
 * 请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 *
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet setLine = new HashSet();
            HashSet setCol = new HashSet();
            HashSet setBox = new HashSet();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !setLine.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !setCol.add(board[j][i])) {
                    return false;
                }
                int k = (i / 3) * 3 + j / 3;
                int l = (i % 3) * 3 + j % 3;
                if (board[k][l] != '.' && !setBox.add(board[k][l])) {
                    return false;
                }
            }
        }
        return true;
    }
}