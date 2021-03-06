/**
 * 移动零
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 */
class Solution {

    public void moveZeroes(int[] nums) {
        int index = -1;
        int zeroNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroNums++;
            } else {
                nums[++index] = nums[i];
            }
        }
        for (int i = 0; i < zeroNums; i++) {
            nums[nums.length - 1 - i] = 0;
        }
    }

}