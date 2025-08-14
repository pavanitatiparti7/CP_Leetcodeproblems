class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        for(char ch : s.toCharArray()){
            dict.put(ch, dict.getOrDefault(ch, 0)+1);
        }
        int oddFreq = 0;
        int evenFreq = Integer.MAX_VALUE;
        for(int val:dict.values()){
            if(val%2 == 0){
                if(val<evenFreq){
                    evenFreq = val;               //evenFreq = Math.min(val, evenFreq)
                }
            }else{
                if(val > oddFreq){
                    oddFreq = val;              //oddFreq = math.max(val, oddFreq)
                }
            }
        }
        return oddFreq - evenFreq;
    }
}
