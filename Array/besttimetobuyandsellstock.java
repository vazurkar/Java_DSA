package Array;

public class besttimetobuyandsellstock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int buyprice = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < buyprice){
                buyprice = prices[i];
            }
            else {
                int currentprofit = prices[i] - buyprice;
                profit = Math.max(currentprofit, profit);
            }
        }
        System.out.println("The maximum profit is: " + profit);
    }
}
