class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>(); // Becoz we are storing indexes in the stack
        int n=temperatures.length;
        int[] res=new int[n]; //integer array to store res
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && (temperatures[i]>=temperatures[stack.peek()])){
                stack.pop(); //we need to pop until (temperatures[i]>=temperatures[stack.peek()]) this condition fails -> hence we use while loop instead of if loop
            }
            if(!stack.isEmpty()){
                 res[i]=stack.peek()-i; //peek works when the stack is empty so we must check first whether the satck is empty or not

            }
            stack.push(i);            
        }
        return res;


    }
}
