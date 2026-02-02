package Hashmap;
import java.util.*;
public class longestsubstring {
    public static int dousinghashmap(String s,int n){
       HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int maxlen=0;
        for(int r=0;r<n;r++){
            Character c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0 )+1);
            while(map.get(c) >1){
                Character leftchar=s.charAt(l);
                map.put(leftchar,map.get(leftchar)-1);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;

        
        }
        
    
    public static void main(String[] args) {
        String s="bbbbb";
        int n=s.length();
       System.out.println(dousinghashmap(s,n));
      
    }
}
