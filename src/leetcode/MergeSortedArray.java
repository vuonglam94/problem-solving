package leetcode;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
 * one sorted array.
 * 
 * Note: The number of elements initialized in nums1 and nums2 are m and n
 * respectively. You may assume that nums1 has enough space (size that is equal
 * to m + n) to hold additional elements from nums2.
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;

		// test case 2
//		int[] nums1 = { 0 };
//		int m = 0;
//		int[] nums2 = { 1 };
//		int n = 1;

		// test case 3
//		int[] nums1 = { 2, 0 };
//		int m = 1;
//		int[] nums2 = { 1 };
//		int n = 1;
		merge(nums1, m, nums2, n);
		System.out.print("OUTOUT: ");
		for (int num : nums1) {
			System.out.print(num + " ");
		}

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index1 = m - 1;
		int index2 = n - 1;
		for (int index = m + n - 1; index >= 0; index--) {
			if (index2 < 0) {
				break;
			}
			if (index1 >= 0 && nums1[index1] > nums2[index2]) {
				nums1[index] = nums1[index1];
				index1--;
			} else {
				nums1[index] = nums2[index2];
				index2--;
			}
		}
	}

}
