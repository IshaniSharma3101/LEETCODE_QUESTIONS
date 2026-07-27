class Solution {
    public int[] plusOne(int[] digits) {
//  int num =0;
// for(int i =0; i <digits.length;i++){
//      num = num * 10 + digits[i];
//  }
// num=num+1;
//  String s = String.valueOf(num);
//  int[] arr = new int[s.length()];

// for (int i = 0; i < s.length(); i++) {
//     arr[i] = s.charAt(i) - '0';
// }
// return arr;
for(int i= digits.length-1;i>=0;i--){
      if(i==0 && digits[i]==9){
        int[] arr = new int[digits.length+1];
        arr[0]=1;
        for(int j=1;j<arr.length-1;j++){
            arr[j]=0;
        }
        return arr;

    }
   if(digits[i]==9) digits[i]=0;

   else if(digits[i]!=9){

    digits[i]+=1;
     break;

    }

  


}

return digits;

    }
}