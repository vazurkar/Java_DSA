package Array;

public class plusone {
    public static void main(String[] args) {
        int [] digits = {1,2,3};
        int carry = 1; // we add one
    for (int i = digits.length - 1; i >= 0; i--) {
        int sum = digits[i] + carry;
        digits[i] = sum % 10;
        carry = sum / 10;
        if (carry == 0) break; // no more propagation needed
    }
    if (carry == 1) {
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        System.arraycopy(digits, 0, res, 1, digits.length);
        digits = res;
    }
    //print the result
    for(int digit : digits){
        System.out.print(digit + " ");
    

    }

    }
}
