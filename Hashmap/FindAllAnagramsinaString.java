package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsinaString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        HashMap<Character, Integer> mapp = new HashMap<>();
        HashMap<Character, Integer> maps = new HashMap<>();

        for(int i=0;i<p.length();i++){
            mapp.put(p.charAt(i),mapp.getOrDefault(p.charAt(i),0)+1);
        }//put all values in p string into hashmap

        int l=0;
        int window = p.length();
        List<Integer> ans = new ArrayList<>();

        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            maps.put(ch,maps.getOrDefault(ch,0)+1);

            if(r-l+1>window){
                char left = s.charAt(l);
                maps.put(left,maps.get(left)-1);
                if(maps.get(left) == 0){
                    maps.remove(left);
                    
                }
                l++;
               

            }
             if (r - l + 1 == window && maps.equals(mapp)) {
                ans.add(l);
            }
        }
        System.out.println(ans);
    }

    

}
