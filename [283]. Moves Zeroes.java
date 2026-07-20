class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[index]= nums[i];   //moves the no. if it's not 0 to num[index]
                index++;
            }
        }
        while(index<nums.length){
            nums[index] = 0;
            index++;
        }
        
    }
}
