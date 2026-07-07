class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        int[] current = intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(current[1]<next[0]){
            ans.add(current);
            current= next;}
            // merged bhi add hoga
            else{
                current[0]=Math.min(next[0],current[0]);
                current[1]=Math.max(next[1],current[1]);

            }
        }
        ans.add(current);
         return ans.toArray(new int[ans.size()][]);
    }
}