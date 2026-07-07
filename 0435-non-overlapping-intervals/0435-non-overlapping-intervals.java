class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
      int[] current = intervals[0];
      int count=0;
      for(int i =1;i<intervals.length;i++){
        int[] next = intervals[i];
        if(current[1]>next[0]){
        count++;
        if(current[1]>next[1]) current =next;
    

        }
        else{
            current = next ;
        }     
      }
return count;

    }
}