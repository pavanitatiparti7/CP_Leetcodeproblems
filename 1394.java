class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> dict=new HashMap<>();
        for(int num:arr){
            dict.put(num, dict.getOrDefault(num, 0)+1);
        }
        List<Integer> keys=new ArrayList<>(dict.keySet());
        int res=-1;
        for(int key:keys){
            if(key==dict.get(key)){
                res=Math.max(res, key);
            }
        }
        return res;
    }
}



/*class Solution {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        for(int num : arr){
            freq[num]++;
        }
        for(int i=500;i >= 1;i--){
            if(freq[i]==i){
                return i;
            }
        }
        return -1;
    }
}*/
