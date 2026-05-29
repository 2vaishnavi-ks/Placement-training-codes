public class SellStock {
    public static void main(String[] args) {
        // int[] stocks = {7,1,5,3,6,4};
        int[] stocks = {-10,-5,-2,-1,1};

        if(stocks.length <2) 
            return;

        int cBuy = stocks[0], cSell = stocks[1];
        int maxProfit = cSell-cBuy;
        
        for(int current = 1; current<stocks.length; current++){
            int currentProfit = stocks[current] - cBuy;
            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
                cSell = stocks[current];
            }
            if(stocks[current]< cBuy)
                cBuy = stocks[current];
        }

        System.out.println((cSell-maxProfit)+" "+cSell);
    }
}
