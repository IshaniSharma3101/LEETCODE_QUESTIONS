class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        while(n>0){
           if(n%10 > max){
            secondmax = max;
            max = n%10;
           }
           else if( n%10 >secondmax){
            secondmax=n%10;
           }
            
            n=n/10;
        }
        return max*secondmax;
    }
}