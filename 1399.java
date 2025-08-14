class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> dict=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=digitSum(i);
            dict.put(sum, dict.getOrDefault(sum, 0)+1);
        }
        int mx=0;
        for(int val:dict.values()){
            if(val>mx){
                mx=val;
            }
        }
        int count=0;
        for(int val:dict.values()){
            if(val==mx){
                count++;
            }
        }
        return count;
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

/*class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> dict=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=digitSum(i);
            dict.put(sum,dict.getOrDefault(sum,0)+1);
        }
        
        int mx=0;
        for(int val:dict.values()){
            if (val>mx){
                mx=val;
            }
        }
        int count=0;
        for(int val:dict.values()){
            if(val == mx){
                count++;
            }
        }
        return count;
    }
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}*/
