class Solution {
    public int firstUniqChar(String s) {
        int[] hash = new int [256];
        for(int i =0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }
       char ch=' ';
        int index=0;
        int count=0;
        int minindex = Integer.MAX_VALUE;
        for(int j=0;j<hash.length;j++){
            if(hash[j]==1){
                count++;
                 ch =(char)j;
                 index = s.indexOf(ch);
                minindex = Math.min(index, minindex);
            }
            
        }
        if(count==0)return -1;
        return minindex;
    }
}