class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int[] arr = new int [nums.length+1];
        for(int i =0; i <nums.length;i++){
            arr[nums[i]]++;
        }
        for(int j=1;j<arr.length;j++){
            if(arr[j]>1) list.add(j);
        }
        return list;
    }
}