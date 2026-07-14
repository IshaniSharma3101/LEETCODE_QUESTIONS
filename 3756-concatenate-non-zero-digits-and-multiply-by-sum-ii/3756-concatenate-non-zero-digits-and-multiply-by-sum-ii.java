class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {

    // BRUTE FORCE TLE DEGA :---
//         int arr[]= new int[queries.length];
//          long MOD = 1000000007L;
//         for(int i =0; i <queries.length;i++){
//            int start = queries[i][0];
//                 int end = queries[i][1];
//                String sub = s.substring(start, end+1);
//               long num = 0;
//          long sum = 0;
//        for(int j=0;j<sub.length();j++){
//          char ch = sub.charAt(j);
//          sum += ch - '0';
//          if(ch!='0') num =(( num*10)+(ch-'0')) % MOD;
//        }
// arr[i] = (int)((num * sum) % MOD);
//             }      
//   return arr;


  long MOD = 1000000007L;

int n = s.length();

long[] prefixSum = new long[n];
int[] prefixCount = new int[n];
long[] prefixNum = new long[n];

long sum = 0;
int count = 0;
long num = 0;

for (int i = 0; i < n; i++) {

    int digit = s.charAt(i) - '0';

    // Prefix Sum
    sum += digit;
    prefixSum[i] = sum;

    // Prefix Count + Prefix Number
    if (digit != 0) {
        count++;
        num = (num * 10 + digit) % MOD;
    }

    prefixCount[i] = count;
    prefixNum[i] = num;
}

int[] ans = new int[queries.length];

long[] pow10 = new long[n + 1];
pow10[0] = 1;
for (int k= 1; k<= n; k++) {
    pow10[k] = (pow10[k - 1] * 10) % MOD;
}

        // Queries
        for ( int j = 0; j< queries.length;j++) {

            int l = queries[j][0];
            int r = queries[j][1];

            // Sum
            long rangeSum = prefixSum[r] - (l > 0 ? prefixSum[l - 1] : 0);

            // Non-zero digit count
            int digits = prefixCount[r] - (l > 0 ? prefixCount[l - 1] : 0);

            // Prefix numbers
            long rightNum = prefixNum[r];
            long leftNum = (l > 0 ? prefixNum[l - 1] : 0);

            // Number in range
            long rangeNum =
                    (rightNum - (leftNum * pow10[digits]) % MOD + MOD) % MOD;

            ans[j] = (int) ((rangeNum * (rangeSum % MOD)) % MOD);
        }

        return ans;
    }
}