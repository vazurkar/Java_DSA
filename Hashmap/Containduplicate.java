package Hashmap;

import java.util.HashMap;

public class Containduplicate {

    public static boolean getans(int nums[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int preIndex = map.get(nums[i]);
                if(Math.abs(i-preIndex) <=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3};
        int k=2;
        boolean ans = getans(nums,k);
        System.out.println(ans);
    }
}
