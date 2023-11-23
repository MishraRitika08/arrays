public class buyAndSellStocks {
    public static int buyAndSell(int arr[]) {

        int buyPrice = arr[0];
        int maxProfit=0;

        for(int i=1;i<arr.length;i++){

            if(buyPrice<arr[i]){
                int profit = arr[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=arr[i];
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[]={7,2,6,1,5};
        System.out.print(buyAndSell(price));
    }
}
