class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // understand these comparator !!! they are so so so important 
        Arrays.sort(intervals, (a,b) -> {
    if(a[0] == b[0])
        return b[1] - a[1];
    return a[0] - b[0];
});
        int count=0;
        for(int i =intervals.length-1; i >0;i--){
            int j = i-1;
            //  if(intervals[i][1]<=intervals[i-1][1]) count++;
            while(j>=0){
                if(intervals[i][1]<=intervals[j][1]) {
                    count++;
              break;
                }
                else j--;
            }

        }
        return intervals.length - count;
    }
}