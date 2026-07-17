/* Truth be told, I had a tough time comprehending it and didn't know much about this approach, 
I had various approaches to solving this even though it is easy I commited many exceptions as my approaches couldn't be coded through conceptualization
as I didn't have much knowledge of syntax and semantics, though I came up with various logic and understand them*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;           // we are getting the length to use it as a reference in looping
        
        for(int i=0; i<n; i++){                    //the first loop is to get the first to compare
            for(int j =i+1; j< n; j++){       // we are nesting the loop as it is using the next num in the list based on the first loop
                if(nums[j]==target-nums[i]){               // we are checking if the target s complement is inside the array
                    return new int[] {i,j};                  // new is used to create a new array consisting of only i and j
                }
            }
        }
        return new int[] {};
    }
}
