class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
        //    int current = intervals[i];
        int[] current = intervals[i];
           if(current[1]<newInterval[0]) // directly push 
           ans.add(current);
           else if(current[0]>newInterval[1]){ // directly push
           ans.add(newInterval);
        //    ans.add(current);
           newInterval = current;}
        else {
            int start = Math.min(current[0],newInterval[0]);
            int end = Math.max(current[1],newInterval[1]);
            newInterval[0]=start;
            newInterval[1]= end;
        }
        }
           ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}