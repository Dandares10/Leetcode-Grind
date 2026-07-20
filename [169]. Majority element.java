class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num: nums){   
            if(count==0){       
                candidate=num;         
            }
            if(candidate==num){            //while candidate = num, count +
                count++;
            }
      
            else{
                count--;           //while candidate != num, count--
            }
        
        }
        return candidate;
    }
}
