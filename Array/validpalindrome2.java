package Array;

public class validpalindrome2 {
    public static boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abcda";
        boolean result = false;
        int l=0;int r=s.length()-1;
        while(l< r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else{
                result = isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1);
                break;
            }
        }
        System.out.println(result);
    }
}
