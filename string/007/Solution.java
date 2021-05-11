/**
 * 实现 strStr()
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 * 当 needle 是空字符串时我们应当返回 0 。
 */

class Solution {
    public int strStr(String haystack, String needle) {
        int hIndex = 0;
        int nIndex = 0;
        while (hIndex < haystack.length() && nIndex < needle.length()) {
            if (haystack.charAt(hIndex) == needle.charAt(nIndex)) {
                hIndex++;
                nIndex++;
            } else {
                hIndex = hIndex - nIndex + 1;
                nIndex = 0;
            }
        }
        return nIndex == needle.length() ? hIndex - nIndex : -1;
    }
}