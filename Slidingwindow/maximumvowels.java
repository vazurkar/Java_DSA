package Slidingwindow;
// using sliding window
public class maximumvowels {

    public static int isvowels(String s, int k){
        boolean isvowel[] = new boolean[26];
        isvowel['a' - 'a'] = true;
        isvowel['e' - 'a'] = true;
        isvowel['i' - 'a'] = true;
        isvowel['o' - 'a'] = true;
        isvowel['u' - 'a'] = true;
        int count=0;
        for(int i=0;i<k;i++){
            if(isvowel[s.charAt(i) - 'a']){
                count++;
            }
        }
        int maxcount = count;
        int startindex=0;
        int endindex = k;
        while(endindex < s.length()){
           if(isvowel[s.charAt(startindex++) - 'a']){
            count--;
           }
           if(isvowel[s.charAt(endindex++) - 'a']){
            count++;
           }
              maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k=3;
        int maxvowels = isvowels(s,k);
        System.out.println(maxvowels);
    }
}
