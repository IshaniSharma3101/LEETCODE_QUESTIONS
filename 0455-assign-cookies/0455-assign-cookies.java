class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
  int count=0;
  // dono ko sort kyu kr rhe h 
  Arrays.sort(g);
  Arrays.sort(s);
  int i = 0;
  int j = 0;
  // koi bhi ek array khtm hote hi ans ajayega 
  while(i<g.length && j <s.length){
  if(g[i]<=s[j]) {
    count++; 
    i++;
    j++;

  }
  // kab kisko aage bdhana h 
else j++;
  }
return count;


    }
}


