package Array;

public class mergesortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int p1 = m - 1;        // last valid element in nums1
        int p2 = n - 1;        // last element in nums2
        int p = m + n - 1;     // last index in nums1

        // Merge from the back
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Copy remaining nums2 elements if any
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        // Print merged array
        for(int i: nums1){
            System.out.print(i+" ");
        }

    }
}