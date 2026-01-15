package Slidingwindow;

public class maxconsecutive {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        int l=0;
        int zero=0;
        int maxlen=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        System.out.println(maxlen);
    }
}
