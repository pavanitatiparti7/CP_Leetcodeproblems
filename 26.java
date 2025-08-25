//Method 1
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int left=0;
        int ptr=0;
        while(left<n){
            if((ptr==0) || (nums[left] != nums[ptr-1])){
                nums[ptr]=nums[left];
                ptr++;
                left++;
            }else{
                left++;
            }
        }
        return ptr;
    }
}

//Method 2 similar to method 1

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int n=nums.length;
//         int left=0;
//         int ptr=0;
//         while(left<n){
//             if(ptr==0){
//                 ptr++;
//                 left++;
//             }else if(nums[left] != nums[ptr-1]){
//                 nums[ptr]=nums[left];
//                 ptr++;
//                 left++;
//             }else{
//                 left++;
//             }
//         }
//         return ptr;
//     }
// }
//Method 3 - using only one pointer 
/*
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int ptr=0;
        for(int num:nums){
            if((ptr==0) || (num != nums[ptr-1])){
                nums[ptr]=num;
                ptr++;
            }
        }
        return ptr;
    }
}*/

/*class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}*/
