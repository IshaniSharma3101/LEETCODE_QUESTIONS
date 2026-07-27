class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int j = s.length()-1;
        while(s.charAt(j) == ' '){
            j-=1;
        }

        for(int i = j;i>=0;i--){
           
            if(s.charAt(i)!= ' ') count++;
            else if(s.charAt(i)==' ') break;

        }
        return count;
    }
}