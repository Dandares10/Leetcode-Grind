class Solution {
    public int[] sortedSquares(int[] nums) {
        

        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];            //to get the squares using the element and change it to its square
        }
        Arrays.sort(nums);         
        return nums;        
    }
}
