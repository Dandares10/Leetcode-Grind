//Funny thing is I didn't even have to try to understand it, it became natural, excepet for that

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i =0; i<n; i++){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);       //it's arrays.sort, I got it wrong in runtime just beacuse of this
    }
}
