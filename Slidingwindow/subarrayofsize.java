package Slidingwindow;

public class subarrayofsize {
    public static void main(String[] args) {
        int arr[] = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshould = 5;
        int avg = 0;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        avg = sum / k;
        if (avg >= threshould) {
                count++;
            }
        int startindex = 0;
        int endindex = k;
        while (endindex < arr.length) {

            sum = sum - arr[startindex++];
            sum = sum + arr[endindex++];
            avg = sum / k;
            if (avg >= threshould) {
                count++;
            }

        }

        System.out.println(count);

    }

}
