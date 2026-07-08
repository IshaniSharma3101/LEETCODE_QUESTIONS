class Solution {
    public long sumAndMultiply(int n) {
       String str = String.valueOf(n);
long num = 0;
long sum = 0;
       for(int i=0;i<str.length();i++){
         char ch = str.charAt(i);
         sum += ch - '0';
         if(ch!='0') num =( num*10)+(ch-'0');
       }
    return num*sum;

    }
}