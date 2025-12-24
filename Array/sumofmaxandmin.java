package Array;

public class sumofmaxandmin {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,6};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int sum=max+min;
        System.out.println("Sum of max and min is: "+sum);
    }
}
