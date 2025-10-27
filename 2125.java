class Solution {
    public int numberOfBeams(String[] bank) {
        int res=0;
        int prevCount=0;
        for(String row:bank){
            int currCount=0;
            for(char ch:row.toCharArray()){
                if(ch=='1'){
                    currCount++;
                }
            }
            if(currCount>0){
                res+=prevCount*currCount;
                prevCount=currCount;
            }
        }
        return res;
    }
}
