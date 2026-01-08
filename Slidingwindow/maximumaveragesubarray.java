package Slidingwindow;

public class maximumaveragesubarray {
    public static void main(String[] args) {
        int num []= {5};
        if(num.length ==1){
            System.out.println((double)num[0]);
            return;
        }
        int k=4;
        int sum=0;
        for(int i=0;i<k;i++){
            sum +=num[i];
        }
        int maxsum = sum;
        int startindex=0;
        int endindex=k;
        while(endindex < num.length){
            sum -=num[startindex++];
            sum +=num[endindex++];
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println((double)maxsum/k);
    }
}
