class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ansIndex = (int) Math.floor(nums.length / 2);
        return nums[ansIndex];
    }
}