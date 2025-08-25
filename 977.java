class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n]; //array of size n
        int left=0; //left pointer
        int right=n-1; //right pointer
        int ptr=n-1; //pointer in result array (ptr is pointed to res)
        while(left<=right){ //if we use < middle element will not ne squared so we use <=
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if(leftsq>rightsq){
                arr[ptr]=leftsq;
                left++;
                ptr--;
            }else{
                arr[ptr]=rightsq;
                right--;
                ptr--;
            }
        }
        return arr;
    }
}
