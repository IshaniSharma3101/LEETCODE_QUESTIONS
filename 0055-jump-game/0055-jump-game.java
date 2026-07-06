class Solution {
    public boolean canJump(int[] nums) {
        // int j =0;
        // while(j<nums.length)
        // j+=nums[j];  
        // }
      int reach=0;
     for(int i =0;i<nums.length;i++){
          if (i>reach) break;
        reach = Math.max(reach,nums[i]+i);
        if( reach>=nums.length-1) return true;
      
     }
     return false;
    }
}