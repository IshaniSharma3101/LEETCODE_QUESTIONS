class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> list = new ArrayList<>();
       int n = nums.length;
       Arrays.sort(nums);
       int lar = nums[n-1];
       int small = nums[0];
       int[] arr = new int[lar+1];
       for(int i =0; i < nums.length;i++){
            arr[nums[i]]=1;
       }
       for(int j = small; j<arr.length;j++){
        if(arr[j]==0)list.add(j);
       }
       return list;
    }
}