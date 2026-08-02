class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int countOne = 0;
        int maximumOne = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                countOne++;
            }else{
                countOne = 0;
            }
           maximumOne = Math.max(maximumOne, countOne);
        }
        return maximumOne;
    }
}