class Solution {
    public int removeDuplicates(int[] nums) {

        int count=2;  /*already assume that first two elements are allow in the array*/

        if(nums.length<3){
            return nums.length;
        }

        for(int i=2;i<nums.length;i++){

            if(nums[i]!=nums[count-2]){
                nums[count]=nums[i];
                count++;
            }
            
        }

        return count;
        
        
    }
}
