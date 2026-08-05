class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        int n = nums.length;
        int singleOne = 0;

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                singleOne = nums[i];
                return singleOne;
            }
        }

        return -1;
      
    }
}