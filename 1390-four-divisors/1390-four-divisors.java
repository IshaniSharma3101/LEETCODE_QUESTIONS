class Solution {
    public int sumFourDivisors(int[] nums) {
        int finalsum=0;
        
        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            int sum=0;
            int count=0;
           for(int j =1;j*j<=num;j++){
                if(num%j==0){
                if(num/j==j){
                    count+=1;
                    sum+=j;
                    if(count>4)break;
                }
                else{
                    count+=2;
                    sum+=j;
                    sum+=num/j;
                    if(count>4)break;
                }
                }
                 
                 }
                 if(count==4)  finalsum+=sum;
        }
        return finalsum;

    }
}



// class Solution {
// public:
//     int sumFourDivisors(vector<int>& nums) {
//         int ans=0;
//         for(int i=0;i<nums.size();i++){
//             int x=nums[i];
//             int count=0;
//             int sum=0;
            
//             for(int j=1;j*j<=x;j++){
//                 if(x%j==0){
//                     count++;
//                     sum=sum+j;
                
//                 if(j!=x/j){
//                     count++;
//                     sum=sum+x/j;
//                 }
//             }
//             }
//             if(count==4){
//                 ans=ans+sum;
//             }
//         }
//         return ans;
//     }
// };