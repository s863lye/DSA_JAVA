class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int miniNum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] < miniNum){
               miniNum = nums[i]; 
            }
        }
        return miniNum;
    }
}