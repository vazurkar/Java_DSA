package Slidingwindow;

public class longestsubstring {
    public static void main(String[] args) {
        String s="pwwkew";
        int l=0;
        int maxlen=0;
        int freq[] = new int [256];
        for(int r=0;r<s.length();r++){
            int index = s.charAt(r);
            while ((freq[index] > 0)) {
                freq[s.charAt(l)]--;
                l++;
            }
            freq[index]++;
            maxlen=Math.max(maxlen,r-l+1);
        }
        System.out.println(maxlen);
    }
}
