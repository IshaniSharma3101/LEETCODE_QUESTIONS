class Solution {
    public char findTheDifference(String s, String t) {
        int[] hash = new int[256];
        int i =0;
        while(i<s.length()){
            hash[s.charAt(i)]++;
            i++;
        }
        int j =0;
        while(j<t.length()){
            hash[t.charAt(j)]--;
            j++;
        }
        int ans=0;
        for(int k=0;k<hash.length;k++){
            if(hash[k]!=0){
         ans =k;
            break;}
        }

        return (char)ans;
        
          }
}