class Solution {
    public void solve(int i ,int[] nums,List<List<Integer>> ans, List<Integer> list){
         if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
         }
         list.add(nums[i]);
         solve(i+1,nums,ans,list);
         list.remove(list.size()-1);
         solve(i+1,nums,ans,list);
         return;

         
         
         

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0,nums,ans, list);
        return ans ;
    }
}