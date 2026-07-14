class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();

        int rank=1;
        for(int i =0; i < temp.length; i++){
            if(!map.containsKey(temp[i])){
            map.put(temp[i],rank);
            rank++;
            }
        }

        int ans[]= new int [arr.length];
        for(int j=0; j <arr.length;j++){
            ans[j]=map.get(arr[j]);
        }
        return ans;
    }
}