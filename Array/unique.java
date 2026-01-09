package Array;

public class unique {
    public static void main(String[] args) {
        int arr []= {2, 3, 1, 6, 3, 6, 2};
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result = result ^ arr[i];
        }
        System.out.println("The unique element in the array is: " + result);
    }
}
