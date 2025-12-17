package Array;
import java.util.Scanner;

public class updatingarray {
    public static int takeinput(String str) {
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        // Placeholder for input method
        return input;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int element = takeinput("Enter the element to update: ");
        int newvalue = takeinput("Enter the new value: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = newvalue;
            }
        }
        System.out.println("The elements in the array after updating are: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
