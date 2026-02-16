package Prefixsum;

public class RangeSumQuery {
    int[] prefix;

    // ✅ Proper constructor (no return type)
    public RangeSumQuery(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    // Method to get sum in range [left, right]
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {
        int nums[] = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery obj = new RangeSumQuery(nums);

        int left = 0;
        int right = 2;
        System.out.println("Sum from " + left + " to " + right + " = " + obj.sumRange(left, right));

        // Example: sum from index 2 to 5
        System.out.println("Sum from 2 to 5 = " + obj.sumRange(2, 5));
    }
}