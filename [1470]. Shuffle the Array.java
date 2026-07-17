    class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] r = new int[nums.length];   //creating a new array result
       int e = 0; //elements

       for(int i =0; i<n; i++){
        r[e++] = nums[i];   //it takes the first element
        r[e++] = nums[i+n];   // since the whole array is 2n, adding it with i creates the next element after i
       }
       return r;
            
        
    }
}/* at this point, there might be a feeling of not getting it, and that's because of i+n; since, 
we are accessing it we subconsciously think the array is going out of thr assigned limit because we forget that the array is of size 2n */ 
