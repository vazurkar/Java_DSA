package Array;
import java.util.Scanner;

public class insertion {
    public static int takeinput(String str) {
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;

    }
    public static int insert(int A[], int position, int element , int size){
        for(int i = size ;i>position;i--){
            A[i]=A[i-1];
        }
        A[position]=element;
        size++;
        return size;
    }

    public static void main(String[] args) {
        int capacity = takeinput("Enter the Capacity: ");
        int A[] = new int[capacity];
        int elements = takeinput("Enter the number of elements to insert");

        for(int i=0;i<elements;i++){
            A[i]=takeinput("Enter the element to insert at index "+i);
        }
        System.out.println("The elements in the array are: ");
        for (int i : A) {
            System.out.print(i+" ");
        }
        int newelement = takeinput("\nEnter the new element to insert: ");
        int position = takeinput("Enter the position to insert the new element: ");
        elements = insert(A, position, newelement, elements);
        System.out.println("The elements in the array after insertion are: ");
        for (int i = 0; i < elements; i++) {
            System.out.print(A[i]+" ");
        }
    }

}
