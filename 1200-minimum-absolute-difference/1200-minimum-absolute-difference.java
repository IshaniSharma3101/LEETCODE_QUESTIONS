class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
  for(int i=1; i <arr.length;i++){
    int diff = Math.abs(arr[i]-arr[i-1]);
    mindiff = Math.min(diff, mindiff);
  }
  
  for(int j=1; j<arr.length; j++){
      int start = arr[j-1];
      int end = arr[j];
      if(Math.abs(start-end) == mindiff){
       List<Integer> list = new ArrayList<>();
       list.add(start);
       list.add(end);
       ans.add(list);
             }

  }
  return ans;

}
}