class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length-1];
        int ans=1;
        for(int i =1;i<=smallest;i++){
               if( smallest % i ==0 && largest % i==0) ans = i;
        }
        return ans;
    }
}