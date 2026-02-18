package Prefixsum;

import java.util.HashMap;

public class subarraysumdivisiblebyk {
    public static void main(String[] args) {
        int nums[] = {4,5,0,-2,-3,1};
        int k=5;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int result=0;
        int prefix=0;
        for(int num:nums){
            prefix +=num;
            int reminder = (prefix%k+k)%k;
            if(map.containsKey(reminder)){
                result+=map.get(reminder);
            }
            map.put(reminder,map.getOrDefault(reminder,0)+1);

        }
        System.out.println(result);
    }
}
