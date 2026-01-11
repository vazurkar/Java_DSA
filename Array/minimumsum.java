package Array;

public class minimumsum {
    public static void main(String[] args) {
        int nums[] = {2,1,5,1,3,2};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum +=nums[i];
        }
        int minimumsum = sum;
        int startindex=0;
        int endindex= k;
        while(endindex < nums.length){
            sum -= nums[startindex++];
            sum += nums[endindex++];
            minimumsum = Math.min(minimumsum, sum);
        }
        System.out.println("The minimum sum of subarray of size k is: " + minimumsum);
    }
}
