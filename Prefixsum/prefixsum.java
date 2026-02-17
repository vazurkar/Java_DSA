package Prefixsum;

import java.util.HashMap;

public class prefixsum {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
       int k=3;
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
         int result=0;
         int prefix=0;
         for(int num:nums){
            prefix+=num;
            if(map.containsKey(prefix-k)){
                result+=map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
            
         }
         System.out.println(result);
    }
}
