class Solution {
    public int longestPalindrome(String s) {
        int[] hash = new int[256];
        int i=0;
        int n = s.length();
        while(i<s.length()){
            hash[s.charAt(i)]++;
            i++;
        }
        int count=0;
        for(int j=0;j<hash.length;j++){
            if(hash[j]%2!=0)count++;
        }
       
        if(count==0){
            return n;
        }
         int ans = n-count+1;
        return ans;
    }
}