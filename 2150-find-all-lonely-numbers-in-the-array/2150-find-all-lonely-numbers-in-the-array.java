class Solution {
    public List<Integer> findLonely(int[] nums) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i <nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i=0; i <nums.length;i++){
            if(map.get(nums[i])==1 && !map.containsKey(nums[i]+1) && !map.containsKey(nums[i]-1)) {
              list.add(nums[i]);
            }
        }
       return list;
    }
}