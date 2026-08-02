class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        int mximum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            if(nums[i] < nums[(i - 1 +  n) % n]){
                count++;
            }
        }
        return count<=1;
    }
}