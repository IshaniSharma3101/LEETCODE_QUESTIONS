class Solution {
    public boolean isValid(String s) {
        char[] arr= new char[s.length()];
        int index=0;
        for(int i=0; i <s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') arr[index++] = s.charAt(i); 
            else{
                if(index==0) return false;
                if((s.charAt(i)==')' && arr[index-1]!='(' ) ||(s.charAt(i)=='}' && arr[index-1]!='{' ) || (s.charAt(i)==']' && arr[index-1]!='[' ) ) return false;
                index--;
            }
        }
        return index==0;
    }
}