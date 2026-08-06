class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int i = 0;
        int j = 0;

        for(int k = 0; k < n; k++){

            for(int l = k+1; l < n; l++){

                if(nums[k] + nums[l] == target){
                    i = k;
                    j = l;
                }

            }
        }
        return new int[]{i, j}; 
    }
}