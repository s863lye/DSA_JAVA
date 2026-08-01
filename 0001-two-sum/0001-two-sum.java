class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> elements = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){
            int complement = target - nums[i];
            if(elements.containsKey(complement)){
    
               return new int[]{elements.get(complement), i};
                

            }

            elements.put(nums[i], i);

        }
        return new int[]{-1, -1};
    }
}