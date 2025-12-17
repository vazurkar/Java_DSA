package Array;
public class reversearray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // Reversing the array  logic1
        // for(int i=0;i<n/2;i++){
        //     int temp = arr[i];
        //     arr[i]=arr[n-i-1];
        //     arr[n-i-1]=temp;
        // }

        // Reversing the array logic2
        int left=0,right=n-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("\nReversed array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
