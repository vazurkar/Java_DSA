package Array;

public class Sortcolor {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        int start=0;
        int mid=0;
        int end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr, start, mid);
                start++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr, mid, end);
                end--;
            }
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
