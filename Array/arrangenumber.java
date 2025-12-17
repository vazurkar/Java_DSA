package Array;
public class arrangenumber {
    public static void main(String[] args) {
        int arr[] = new int[6];
        int L = 0;
        int R = arr.length - 1;
        int element=1;
        while(L<R){
            arr[L++] = element++;
            arr[R--] = element++;
        }
        if(L==R){
            arr[L] = element;
        }
        System.out.println("The arranged numbers are: ");
        for(int index : arr){
            System.out.print(index+" ");
        }
    }
}
