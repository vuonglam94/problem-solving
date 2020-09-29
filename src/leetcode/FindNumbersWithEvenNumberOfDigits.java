package leetcode;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * 
 * Given an array nums of integers, return how many of them contain an even
 * number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits {

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
//		int[] nums = { 555, 901, 482, 1771 };
		int result = findNumbersWithEvenNumberOfDigits(nums);
		System.out.println("Numbers with Even Number of Digits: " + result);
	}

	private static int findNumbersWithEvenNumberOfDigits(int[] nums) {
		int result = 0;
		for (int num : nums) {
			if (computeNumberOfDigitsOfANumber(num) % 2 == 0) {
				result++;
			}
		}
		return result;
	}

	private static int computeNumberOfDigitsOfANumber(int number) {
		int numberOfDigits = 0;
		int temp = 1;
		while (temp <= number) {
			numberOfDigits++;
			temp *= 10;
		}
		return numberOfDigits;
	}

}