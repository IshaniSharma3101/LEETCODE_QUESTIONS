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

// without data structure :- ( vahi 2 loop ka concept easy tha bro )
// class Solution {
//     public long sumAndMultiply(int n) {
//         int x=0;
//         while(n>0){
//             int digit = n%10;
//             if(digit != 0)
//                 x= (10*x)+digit;
//             n/=10;
//         }
//         long rev=0;
//         long sum=0;
//         while(x>0){
//             int dig = x%10;
//             rev = (10*rev)+dig;
//             sum += dig;
//             x/=10;
//         }
//         return rev*sum;
//     }
// }