class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while(left<right){
            if(nums[left]%2==0){         //if it's even moves to front of the array
                left++;
            }
            else if(nums[right]%2!=0){
                right--;                       //if it's odd moves to back of the array
            }
            else{
                int temo = nums[left];             // it's probably because of odd or even numbers in the 
                nums[left]= nums[right];           //passes right to left
                nums[right] = temo;                //passes left to right
                left++;
                right--;
            }
        }
        return nums;
    }
}
