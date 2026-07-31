class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i =1;i*i<=n;i++){
            
            // if(n/i==i) count++;
            // else if(n%i==0) count+=2;

            if(n%i==0){
                if(n/i==i)count+=1;
                else count+=2;
            }
            if(count>3) return false;
        }
        if(count==3)return true;
        return false;
    }
}