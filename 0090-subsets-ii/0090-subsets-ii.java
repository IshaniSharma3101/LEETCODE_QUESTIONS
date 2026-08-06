class Solution {
    public void solve(int i,int[] nums, List<Integer> list ,List<List<Integer>> ans){
        if(i==nums.length){
            if(!ans.contains(list))
                ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        solve(i+1,nums,list,ans);
        list.remove(list.size()-1);
        solve(i+1,nums,list,ans);
        return;

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    Arrays.sort(nums);
    solve(0,nums,list,ans);
    return ans;
    }
}