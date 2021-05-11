/**
 * 验证回文串
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int startIndex = 0;
        int lastIndex = chars.length - 1;
        while (startIndex < lastIndex) {
            while (startIndex < lastIndex && !Character.isLetterOrDigit(chars[startIndex])) {
                startIndex++;
            }
            while (startIndex < lastIndex && !Character.isLetterOrDigit(chars[lastIndex])) {
                lastIndex--;
            }
            if (Character.toLowerCase(chars[startIndex]) != Character.toLowerCase(chars[lastIndex])) {
                return false;
            }
            startIndex++;
            lastIndex--;
        }
        return true;
    }
}