package Array;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Triplet Sum Problem");
        int arr[] = {7,2,1,5,4,3};
        int x = 12;
        int count = 0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                for(int k=j+1;k<=arr.length-1;k++){
                    if(arr[i]+arr[j]+arr[k] == x){
                        count++;
                    }
                }
            }
        }
        System.out.println("The count of triplets is: " + count);
    }
}
