package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * 
 * Given an array of integers A sorted in non-decreasing order, return an array
 * of the squares of each number, also in sorted non-decreasing order.
 */
public class SquaresOfASortedArray {

	public static void main(String[] args) {
		int[] A = { -4, -1, 0, 3, 10 };
//		int[] A = {-7, -3, 2, 3, 11};
		int[] sortedSquares = sortedSquares(A);
		System.out.println("Squares Of A Sorted Array: ");
		for (int num : sortedSquares) {
			System.out.print(num + " ");
		}
	}

	private static int[] sortedSquares(int[] A) {
		int inputLength = A.length;
		int[] sortedSquares = new int[inputLength];
		for (int i = 0; i < inputLength; i++) {
			sortedSquares[i] = A[i] * A[i];
		}
		Arrays.sort(sortedSquares);
		return sortedSquares;
	}

}
