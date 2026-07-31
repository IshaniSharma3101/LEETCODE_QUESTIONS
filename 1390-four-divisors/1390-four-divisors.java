class Solution {
    public int sumFourDivisors(int[] nums) {
        int finalsum=0;
        for(int i =0;i<nums.length;i++){
            int sum=0;
            int count=0;
            for(int j =1;j<=(int)Math.sqrt(nums[i]);j++){
                if(nums[i]%j==0){
                if(nums[i]/j==j){
                    count+=1;
                    sum+=j;
                }
                else{
                    count+=2;
                    sum+=j;
                    sum+=nums[i]/j;
                }
                }
                 
                 }
                 if(count==4)  finalsum+=sum;
        }
        return finalsum;

    }
}