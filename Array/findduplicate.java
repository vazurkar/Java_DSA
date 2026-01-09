package Array;

public class findduplicate {
    public static void main(String[] args) {
        int arr[] = {0, 7, 2, 5, 4, 7, 1, 3, 6};
        int xor = 0;
        int n = arr.length;

        // XOR all array elements
        for (int num : arr) {
            xor ^= num;
        }
         for (int i = 0; i <= n - 2; i++) {
            xor ^= i;
        }
        System.out.println("The duplicate element is: " + xor);
    }
}
