class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int a: asteroids){
            boolean destroy=false;
            while(!stack.isEmpty() && a<0 && stack.peek() > 0){
                if(stack.peek()==Math.abs(a)){
                    stack.pop();
                    destroy=true;
                    break;
                }
                else if(stack.peek() < Math.abs(a)){
                    stack.pop();
                    continue;
                }
                else{
                    destroy=true;
                    break;
                }
            }
            if(!destroy){
                stack.push(a);
            }
        }
        int[] res=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            res[i]=stack.pop();
        }
        return res;
    }
}
