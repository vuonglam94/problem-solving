package leetcode;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * 
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array.
 */
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
//		int[] nums = { 1 };
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		int max = findMaxConsecutiveOnes(nums);
		System.out.println("Max: " + max);
	}

	private static int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int max = 0;
		int currentMax = 0;
		for (int n : nums) {
			if (n == 1) {
				currentMax++;
			} else {
				if (currentMax > max) {
					max = currentMax;
				}
				currentMax = 0;
			}
		}
		if (currentMax > max) {
			max = currentMax;
		}
		return max;
	}

}