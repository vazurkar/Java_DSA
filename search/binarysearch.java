package search;
// Binary Search in Java
public class binarysearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 11;
        int left = 0;
        int right = nums.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                found = true;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (found) {
            System.out.println("Target " + target + " found in the array.");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
