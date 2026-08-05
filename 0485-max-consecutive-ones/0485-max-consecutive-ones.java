class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int countOne = 0;
        int maxOne = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){

            if(nums[i] == 1){
                countOne++;

            }else{
                countOne = 0;
            }
            maxOne = Math.max(maxOne, countOne);
        }
        return maxOne;
    }
}