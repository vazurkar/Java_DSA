package Array;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 8;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                System.out.println(i);
                break;
            }
            else if(nums[i] > target){
                System.out.println(i);
                break;
            }
            else if(nums[i] < target && i == nums.length-1){
                System.out.println(nums.length);
                break;
            }

        }
    }
}
