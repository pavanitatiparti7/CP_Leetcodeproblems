class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) { // void- so return statement
        int left=m-1;
        int right=n-1;
        int ptr=m+n-1;
        while(left>=0 && right>=0){
            if(nums1[left]>nums2[right]){
                nums1[ptr]=nums1[left];
                left--;
                ptr--;
            }
            else{
                nums1[ptr]=nums2[right];
                right--;
                ptr--;
            }
        }
      class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) { // void- so return statement
        int left=m-1;
        int right=n-1;
        int ptr=m+n-1;
        while(left>=0 && right>=0){
            if(nums1[left]>nums2[right]){
                nums1[ptr]=nums1[left];
                left--;
                ptr--;
            }
            else{
                nums1[ptr]=nums2[right];
                right--;
                ptr--;
            }
        }
        //if still nums2 has elements they must be copied 
        while(right>=0){
            nums1[ptr]=nums2[right];
            right--;
            ptr--;
        }
    }
}
        while(right>=0){
            nums1[ptr]=nums2[right];
            right--;
            ptr--;
        }
    }
}
