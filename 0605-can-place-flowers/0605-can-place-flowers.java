class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // if(flowerbed.length==1 && n >1) return false;

        // if(n==1 && flowerbed.length==1 && flowerbed[0]==1) return false;
        // for(int i =0; i <flowerbed.length;i++){
        //     if(i==0 && flowerbed[i+1]==0){
        //             n--;
        //             flowerbed[i]=1;
        //     }

        //     else if(i==flowerbed.length-1 && flowerbed[i-1]==0){
        //           n--;
        //           flowerbed[i]=1;
        //     }

        //     else{
        //     if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
              
        //             n--;
        //             flowerbed[i]=1;
            
        // }
        // }
        // }
        // if(n>0) return false;
        // else 
        // return true;

      

//         for(int i =0; i <flowerbed.length;i++){
//               boolean leftEmpty =(i == 0) || flowerbed[i-1] == 0;

//               boolean rightEmpty = (i == flowerbed.length-1) || flowerbed[i+1] == 0;
//             if(flowerbed[i]==0){
//             if(leftEmpty && flowerbed[i+1]==0){
//                      n--;
//                  flowerbed[i]=1;
//             }
//             else if ( rigthEmpty && flowerbed[i-1]==0){
//                         n--;
//                  flowerbed[i]=1;
//             }
//             }
//         }
// if(n>0) return false ;
// return true;




for(int i=0; i <flowerbed.length;i++){
    boolean leftempty = i==0 || flowerbed[i-1]==0 ;
boolean rightempty =  i==flowerbed.length-1 || flowerbed[i+1]==0 ;
    if(flowerbed[i]==0 && leftempty && rightempty){
        n--;
        flowerbed[i]=1;
    }

}  
if(n>0) return false;
return true;
  } 
}