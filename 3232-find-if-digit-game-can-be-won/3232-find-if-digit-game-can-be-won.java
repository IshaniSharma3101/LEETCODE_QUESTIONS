class Solution {
    public boolean canAliceWin(int[] nums) {
        int singlesum=0;
        int sum=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<=9){
                singlesum+=nums[i];
            }
            sum+=nums[i];
        }
        int doublesum = sum-singlesum;
        if(singlesum==doublesum)return false;
        return true;
    }
}