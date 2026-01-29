package Hashmap;
import java.util.*;
public class containsduplicate1 {
    public static void main(String[] args) {
        int nums[]={1,1,1,3,3,4,3,2,4,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                System.out.println("true");
                return;

            }
            else{
                map.put(nums[i],1);

            }
        }
        System.out.println("false");
    }
}
