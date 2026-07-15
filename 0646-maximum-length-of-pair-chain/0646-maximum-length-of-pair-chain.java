class Solution {
    public int findLongestChain(int[][] pairs) {
        
Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
int lastend = pairs[0][1];
int length =1;
for(int i=1;i<pairs.length;i++){
    int currstart=pairs[i][0];
    if(currstart>lastend){
        length++;
        lastend=pairs[i][1];

}
}
return length;

    }
}