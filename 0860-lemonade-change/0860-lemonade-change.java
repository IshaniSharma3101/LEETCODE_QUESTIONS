class Solution {
    public boolean lemonadeChange(int[] bills) {
    int five =0;
    int ten =0;
    int twenty =0;
    for(int i =0; i <bills.length;i++){
        if(bills[i]==5) five++;
        else if(bills[i]==10){
            if(five<1) return false;        
            else {
                five--;
              ten++;}
        }
        else{
            // ye phle kyu kikha h yhi yaha main thing h 
          if (ten >= 1 && five >= 1) {
    ten--;
    five--;
    twenty++;
}

// or ye else if m likha ye important h
else if (five >= 3) {
    five -= 3;
    twenty++;
}
else {
    return false;
}

    }
    
    }
    return true;
    }
}