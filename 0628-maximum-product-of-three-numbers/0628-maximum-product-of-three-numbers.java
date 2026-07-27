class Solution {
    public int maximumProduct(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // int secondmax= Integer.MIN_VALUE;
        // int thirdmax = Integer.MIN_VALUE;
        // for(int i =0; i <nums.length;i++){
        //     if(Math.abs(nums[i])>max){
        //         thirdmax = secondmax;
        //         secondmax = max;
        //         max = nums[i];
        //     }
        //     else if (Math.abs(nums[i])>secondmax){
        //         thirdmax=secondmax;
        //         secondmax =nums[i];
        //     }
        //     else{
        //         thirdmax = nums[i];
        //     }
        // }

        // return max*thirdmax*secondmax;


        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<=min1){
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i]<=min2){
                min2=nums[i];
            }
            if(nums[i]>=max){
                thirdmax = secondmax;
                secondmax = max;
                max = nums[i];
            }
            else if(nums[i]>=secondmax){
                thirdmax = secondmax;
                secondmax = nums[i];
            }
            else if (nums[i]>=thirdmax){
                thirdmax=nums[i];
            }
        }
       if(min1*min2*max > max*secondmax*thirdmax) return min1*min2*max;
       else return max*secondmax*thirdmax;
    }
}