package Week_01;

class RotateArray {

    /**
     * 使用额外的数组来保存
     * 
     * @param nums 目标数组
     * @param k    右移的位数
     */
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
