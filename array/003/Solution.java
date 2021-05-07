import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] newNums = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < newNums.length; i++) {
            if ((i + k) >= newNums.length) {
                nums[i + k - newNums.length] = newNums[i];
            } else {
                nums[i + k] = newNums[i];
            }
        }
    }
}