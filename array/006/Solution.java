import java.util.ArrayList;
import java.util.HashMap;

/**
 * 两个数组的交集
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 */
class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int value : nums1) {
            hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
        }
        for (int value : nums2) {
            if (hashMap.getOrDefault(value, 0) > 0) {
                arrayList.add(value);
                hashMap.put(value, hashMap.get(value) - 1);
            }
        }
        int[] nums = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            nums[i] = arrayList.get(i);
        }
        return nums;
    }

}