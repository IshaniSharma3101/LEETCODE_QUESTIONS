class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0;
        int j =0;
        int len =0;
        int maxlen =0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                if(map.get(ch)<i) map.put(ch,j);
                else{
                    i=map.get(ch)+1;
                    map.put(ch,j);
                }
                  len=j-i+1;
                  maxlen=Math.max(len,maxlen);
            }
            map.put(ch,j);
            len=j-i+1;
            maxlen=Math.max(len,maxlen);
            j++;

        }
return maxlen;
    }
}
