class Solution {
    public void func(int n ,int open, int close, ArrayList<String> ans, String s){
          if(close+open==2*n){
              ans.add(s);
              
              return;
          }
          if(open<n){
         
              func(n,open+1,close,ans,s+"(");
              
          }
          if(close<open){
              func(n,open,close+1,ans,s+")");
          }
          
      }

    public List<String> generateParenthesis(int n) {
         int open =0;
       int close=0;
       ArrayList<String> ans = new ArrayList<>();
       String s = "";
       func(n,open, close,ans,s);
       return ans;
    }
}