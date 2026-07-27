class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
int[] arr = new int[nums.length+1];
arr[0]=1;
for(int i =0;i<nums.length;i++){
 int j = nums[i];
 arr[j]++;
}
List<Integer> list = new ArrayList<>();
for(int k=0;k<arr.length;k++){
    if(arr[k]==0) list.add(k);

}


return list;

    }
}