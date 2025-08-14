class Solution {
    public int maximumSum(int[] nums) {
       HashMap<Integer, List<Integer>> dict=new HashMap<>();
        for(int num : nums){  //updates hashmap
        int sum=digitSum(num);
        if(!dict.containsKey(sum)){
            dict.put(sum, new ArrayList<>());
        }
        dict.get(sum).add(num); //we will get list either of sum or digits 
       }
       int res=-1;
       for(List<Integer> arr : dict.values()){   //to read elements(only values) from the hashmap
        if(arr.size()>=2){ 
            Collections.sort(arr); //used to sort the elements of a List in a specific order
            int n=arr.size();
            res=Math.max(res, arr.get(n-2)+arr.get(n-1));
        }  
       }
       return res;
    }
    private int digitSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;      
    }
}
