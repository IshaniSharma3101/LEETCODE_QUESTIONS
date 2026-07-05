class Solution {
    public int longestOnes(int[] nums, int k) {
int i =0;
int j =0;
int zeroes=0;
int len =0;
int maxlen =0;
while(j<nums.length){
    if(nums[j]==0) zeroes++;
     while(zeroes>k){
        if(nums[i]==0) zeroes--;
        i++;
        
    }
    len = j-i+1;
    maxlen = Math.max(len,maxlen);
    j++;
}
return maxlen;

    }
}