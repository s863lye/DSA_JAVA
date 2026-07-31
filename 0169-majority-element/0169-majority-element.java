

class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       int count = 0;
       int element = nums[0];

       for(int i = 0; i < n; i++){
        if(nums[i] == element){
            element = nums[i];
            count++;
        }else if(nums[i] != element && count == 0){
            element = nums[i];
            count++;
        }
        else{
            count--;
        }
       }
       return element; 
    }
}