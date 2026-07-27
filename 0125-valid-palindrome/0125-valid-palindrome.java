class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "");

    //     char ch1=' ';
    //     char ch2=' ';
    // boolean leftvalid = Character.isLetterOrDigit(ch1);
    // boolean rightvalid = Character.isLetterOrDigit(ch2);

   int i =0;
   int j =s.length()-1;
   while(i<=j){
   

    char ch1 = s.charAt(i);
    char ch2 = s.charAt(j);

    boolean leftvalid = Character.isLetterOrDigit(ch1);
    boolean rightvalid = Character.isLetterOrDigit(ch2);

    ch1 = s.charAt(i);
    ch2 = s.charAt(j);
    if(leftvalid && rightvalid){
         if(ch1!=ch2) return false;
         i++;
         j--;    
    }
     if(!leftvalid){
        i++;
    }
    else if(!rightvalid){
        j--;
    }
   }
//         while(i<=j){
//             if(s.charAt(i)!=s.charAt(j)) return false;
//            i++;
//            j--;
//         }
return true;
    }
}


// Character.isLetterOrDigit(ch)
// Character.toLowerCase(ch)