class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> dict=new HashMap<>();
        for(int num:nums){
            dict.put(num, dict.getOrDefault(num, 0)+1);
        }
        for(int value : dict.values()){
            if(value %2 != 0){
                return false;
            }
        }
        return true;
    }
}
