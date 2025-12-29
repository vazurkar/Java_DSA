package Array;

public class singlenumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        System.out.println("The single number is: " + result);
    }
}
