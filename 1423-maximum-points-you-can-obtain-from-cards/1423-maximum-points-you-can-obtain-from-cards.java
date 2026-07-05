class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i = k-1;
        int j = cardPoints.length-1;
        int sum=0;
      
        for(int p =0; p<=k-1;p++){
            sum+=cardPoints[p];
        }
        int maxsum = sum;
        while(i>=0){
          sum+=cardPoints[j];
          sum-=cardPoints[i];
          j--;
          i--;
          maxsum= Math.max(sum,maxsum);  
        }
        return maxsum;
    }
}