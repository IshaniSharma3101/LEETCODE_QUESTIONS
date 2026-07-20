class Solution {
   
    public int arraySign(int[] nums) {
        // long product = 1;
        int sign =1;
        for(int i =0;i<nums.length;i++){
            // product*=nums[i];
             if(nums[i]<0) sign = -1*sign;
            else if(nums[i]==0){
                 sign =0;
                 break;
        }
        }
      return sign ;
    }
}