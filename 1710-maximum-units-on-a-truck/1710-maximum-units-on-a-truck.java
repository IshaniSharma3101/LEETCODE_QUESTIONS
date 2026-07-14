class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       // ye comparator h jo 2d array k inko smjhna jarrori h 
       Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
       int unit=0;
       for(int i =0;i<boxTypes.length;i++){
        if(truckSize<=0) break;
        if(boxTypes[i][0]<=truckSize){
        unit=unit+(boxTypes[i][0]*boxTypes[i][1]);
        truckSize = truckSize-boxTypes[i][0];
        }
        else {
            unit=unit+(truckSize*boxTypes[i][1]);
            break;
        }

        
       }
       return unit;
    }
}