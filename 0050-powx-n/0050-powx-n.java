// class Solution {
//     public double myPow(double x, int n) {
// //     double ans = x;
// //     if(n==1) return ans;
   
// //     ans=x*x; 
// //  return x * myPow(x,n-1);// yaha hmne fun

// if(n==0) return 1;
// return x*myPow(x,n-1);
// // isko depth m dry run krke smjhna or tum ky gltiyaa kr rhe the kyu kr rhe the vse kyu nhi krna hota h vo smjhna 
// }
//     }
   

   class Solution {

    public double myPow(double x, int n) {

        long N = n;   // Integer.MIN_VALUE handle karne ke liye

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    private double power(double x, long n) {

        if (n == 0)
            return 1;

        double half = power(x, n / 2);

        if (n % 2 == 0)
            return half * half;

        return x * half * half;
    }
}