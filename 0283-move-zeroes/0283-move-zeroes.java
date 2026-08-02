class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zero = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = tmp;
                zero++;
            }
        }
  }
}