package Array;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        
        int arr[] = {3,2,4};
        int target =6;
        int result[] = twoSum(arr, target);
        for(int i: result){
            System.out.print(i+" ");
        }
       
        
    }
}
