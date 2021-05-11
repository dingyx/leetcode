import java.util.HashMap;

/**
 * 字符串中的第一个唯一字符
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            hashMap.put(chars[i], hashMap.getOrDefault(chars[i], 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}