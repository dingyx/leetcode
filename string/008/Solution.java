/**
 * 外观数列
 *
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 * 1
 * 11
 * 21
 * 1211
 * 111221
 */

class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for (int k = 1; k < n; k++) {
            StringBuilder sb = new StringBuilder();
            char charAt = ' ';
            int num = 0;
            for (int i = 0; i < result.length(); i++) {
                if (i != 0) {
                    if (charAt != result.charAt(i)) {
                        sb.append(num).append(charAt);
                        num = 0;
                    }
                }
                charAt = result.charAt(i);
                num++;
            }
            sb.append(num).append(charAt);
            result = sb.toString();
        }
        return result;
    }
}

