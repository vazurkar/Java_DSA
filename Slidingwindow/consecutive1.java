package Slidingwindow;

public class consecutive1 {
    public static void main(String[] args) {
        int nums[] = {1,0,1,1,0,1};
    int l=0;
    int maxnum=0;
    int zero=0;
    for(int r=0;r<nums.length;r++){
        if(nums[r] == 0){
            zero++;
        }
        while(zero > 0){
            if(nums[l]==0){
                zero--;
            }
            l++;
        }
        maxnum = Math.max(maxnum, r - l + 1);
    }
    System.out.println(maxnum);
}
}
