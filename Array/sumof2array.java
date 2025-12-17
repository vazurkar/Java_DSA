package Array;
public class sumof2array {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5 };
        int B[] = { 6, 7, 8, 9,};
        int sum[] =new int [Math.max(A.length, B.length)+1];
        int i=A.length-1;
        int j=B.length-1;
        int k=sum.length-1;
        int carry=0;
        while(i>=0 && j>=0){
            int total = A[i]+B[j]+carry;
            sum[k]=total%10;
            carry = total/10;
            i--;
            j--;
            k--;

        }
        while(i>=0){
            int total = A[i]+carry;
            sum[k]=total%10;
            carry = total/10;
            i--;
            k--;
        }
        while(j>=0){
            int total = B[j]+carry;
            sum[k]=total%10;
            carry = total/10;
            j--;
            k--;
        }
        sum[0]=carry;
        System.out.println("The sum of two arrays is: ");
        for(int index : sum){
            System.out.print(index+" ");
        }
    }
}
