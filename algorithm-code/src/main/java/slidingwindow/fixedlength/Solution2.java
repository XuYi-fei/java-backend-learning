package slidingwindow.fixedlength;

/**
 * @program: leetcode
 * @description:
 * @author: XuYifei
 * @create: 2024-09-20
 */

// leetcode 643
class Solution2 {
    public double findMaxAverage(int[] nums, int k) {
        if(k > nums.length){
            return 0;
        }
        double maxSum = 0, currentSum = 0;

        for(int i = 0; i < nums.length; i ++){
            if(i < k){
                maxSum += nums[i];
                currentSum += nums[i];
            }else{
                currentSum += nums[i] - nums[i - k];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum / k;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums = {-1};
        int k = 1;
        System.out.println(solution.findMaxAverage(nums, k));
    }
}
