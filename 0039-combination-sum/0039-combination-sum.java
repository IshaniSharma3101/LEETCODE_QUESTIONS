class Solution {

     public void func(int i, int[]arr, int target, List<Integer> list, List<List<Integer>> ans){
          if(i==arr.length){
              if(target==0) ans.add(new ArrayList<>(list));
              return;
          }
          if(target==0){
             ans.add(new ArrayList<>(list));
             return;
          }
          if(target<0){
              return;
          }
          
          list.add(arr[i]);
          func(i,arr,target-arr[i],list,ans);
          list.remove(list.size()-1);
          func(i+1,arr,target,list,ans);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          // code here
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        func(0,candidates,target,list,ans);
        return ans; 
    }
}