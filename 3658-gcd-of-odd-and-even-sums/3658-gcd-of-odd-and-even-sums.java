class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven= n*(n+1);
        int sumOdd=n*n;
       
    int ans = 1;

    for (int i = 1; i <= Math.min(sumEven, sumOdd); i++) {
        if (sumEven % i == 0 && sumOdd% i == 0)
            ans = i;
    }

    return ans;
}
    }


// for optimal learn euclidiean formula of GCD 