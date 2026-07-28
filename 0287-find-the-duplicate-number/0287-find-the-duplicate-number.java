class Solution {
    public int findDuplicate(int[] nums) {
       int[] arr = new int[nums.length];
       for(int i =0;i<nums.length;i++){
            arr[nums[i]]++;
       }
 int ans=0;
       for(int j=0;j<arr.length;j++){
        if(arr[j]>1) {
            ans = j;
            break;
        }
       }
return ans;
    }
}