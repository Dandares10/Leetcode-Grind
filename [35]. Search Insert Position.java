class Solution {
    public int searchInsert(int[] nums, int target) {
      for(int i = 0; i<nums.length; i++){
        if(target<=nums[i]){
            return i;            // gets the index of the number where it is to be inserted
        }                          // if small when the target is not available or equal to target
      } 
    return nums.length;                // I basically had no idea earlier but upon clarifying and thinking theough
    }                                  // saw that the nums length is the length which is greater by index by 1, so it gives the
}                                      // last literal, I mean it's obvious yet, I didn't notice
