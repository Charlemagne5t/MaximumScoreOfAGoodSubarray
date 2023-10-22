public class Solution {
    public int maximumScore(int[] nums, int k) {
        int left = k;
        int right = k;
        int maxTotalSum = nums[k];
        int currentMin = nums[k];

        while (left >= 0 || right < nums.length){
            if(left > 0 && right < nums.length - 1){
                if(nums[left - 1] >= currentMin && nums[right + 1] >= currentMin){
                    left--;
                    right++;
                    maxTotalSum = Math.max(maxTotalSum, currentMin * (right - left + 1));
                } else if (nums[left - 1] >= nums[right + 1]) {
                    left--;
                    currentMin = Math.min(currentMin, nums[left]);
                    maxTotalSum = Math.max(maxTotalSum, currentMin * (right - left + 1));
                }else {
                    right++;
                    currentMin = Math.min(currentMin, nums[right]);
                    maxTotalSum = Math.max(maxTotalSum, currentMin * (right - left + 1));
                }
            }else if(left == 0 && right < nums.length - 1){
                right++;
                currentMin = Math.min(currentMin, nums[right]);
                maxTotalSum = Math.max(maxTotalSum, currentMin * (right - left + 1));
            } else if (left > 0 && right == nums.length - 1) {
                left--;
                currentMin = Math.min(currentMin, nums[left]);
                maxTotalSum = Math.max(maxTotalSum, currentMin * (right - left + 1));
            } else if (left == 0 && right == nums.length - 1) {
                break;
            }
        }
        return maxTotalSum;
    }
}
