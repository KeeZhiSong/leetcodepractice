class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            int value = map.getOrDefault(difference, -1);
            
            if (value != -1 && value != i) {
                arr[0] = i;
                arr[1] = value;
                break;
            } else {
                continue;
            }
        }
        return arr;
    }
}