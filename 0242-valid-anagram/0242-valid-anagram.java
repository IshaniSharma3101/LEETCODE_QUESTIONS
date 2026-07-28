class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m)return false;
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)]++;
            arr2[t.charAt(i)]++;
        }
        if(Arrays.equals(arr1, arr2)) return true;
       return false; 
    }
}