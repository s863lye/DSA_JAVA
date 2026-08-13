class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        int lowerBound = n;
        int upperBound = n;

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] >= target) {
                lowerBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] > target) {
                upperBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (lowerBound == n || nums[lowerBound] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lowerBound, upperBound - 1};
    }
}