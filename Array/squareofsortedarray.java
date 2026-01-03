package Array;

public class squareofsortedarray {
    public static void main(String[] args) {
        int nums[] = {-7,-3,2,3,11};
       int l = 0;
       int r = nums.length - 1;
       int index = nums.length - 1;
       int result [] = new int[nums.length];
       while(l<= r){
        int leftvalue = nums[l] * nums[l];
        int rightvalue = nums[r] * nums[r];
        if(rightvalue > leftvalue){
            result[index--] = rightvalue;
            r--;
        } else {
            result[index--] = leftvalue;
            l++;
        }
        
       }
        for(int i=0;i< result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
