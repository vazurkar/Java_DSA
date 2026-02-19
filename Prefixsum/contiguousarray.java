package Prefixsum;

import java.util.HashMap;

public class contiguousarray {
    public static void main(String[] args) {
        int nums[] = {0,1,1,1,1,1,0,0,0};
        int prefix=0;
        int maxlength=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                prefix +=-1;
            }
            else{
                prefix +=1;
            }
            if(map.containsKey(prefix)){
                maxlength = Math.max(maxlength,i-map.get(prefix));
            }
            else{
                map.put(prefix,i);
            }
        }
        System.out.println(maxlength);
    }
}
