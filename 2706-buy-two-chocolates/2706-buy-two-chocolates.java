class Solution {
    public int buyChoco(int[] prices, int money) {
    Arrays.sort(prices);
    int count=0;
    int start = money;
    for(int i =0; i <prices.length;i++){
        if( count<2 &&  prices[i]<=money){
            money-=prices[i]; 
            count++;

        }
       
        else {
            break;
        }

    }

if(count<2) return start;

return money ;
    }
}