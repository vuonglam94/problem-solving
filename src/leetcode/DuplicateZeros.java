package leetcode;

/**
 * https://leetcode.com/problems/duplicate-zeros/
 * 
 * Given a fixed length array arr of integers, duplicate each occurrence of
 * zero, shifting the remaining elements to the right. Note that elements beyond
 * the length of the original array are not written. Do the above modifications
 * to the input array in place, do not return anything from your function.
 */
public class DuplicateZeros {

	public static void main(String[] args) {
//		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
//		int[] arr = { 1, 5, 2, 0, 6, 8, 0, 6, 0 };
//		int[] arr = { 0, 0, 0, 0, 0, 0, 0 };
		int[] arr = { 8, 4, 5, 0, 0, 0, 0, 7 };
		System.out.print("INPUT: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		duplicateZeros1(arr);
		System.out.print("\n" + "OUTPUT: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	/**
	 * Solution 1: O(N^2)
	 * 
	 * Duyệt qua từng phần tử của arr, nếu: - phần tử = 0 thì insert 0 vào phần tử
	 * tiếp theo của mảng, thêm 0 vào phần tử i + 1 và dịch phải các phần tử - phần
	 * tử != 0 thì tiếp tục
	 */
	private static void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				insertAtIndexInArray(arr, 0, i);
				i++;
			}
		}
	}

	private static void insertAtIndexInArray(int[] arr, int number, int index) {
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = number;
	}

	// Solution 2: O(N)
	private static void duplicateZeros1(int[] arr) {
		int possibleDups = 0;
		int length_ = arr.length - 1;

		// Find the number of zeros to be duplicated
		// Stopping when left points beyond the last element in the original array
		// which would be part of the modified array
		for (int left = 0; left <= length_ - possibleDups; left++) {

			// Count the zeros
			if (arr[left] == 0) {

				// Edge case: This zero can't be duplicated. We have no more space,
				// as left is pointing to the last element which could be included
				if (left == length_ - possibleDups) {
					// For this zero we just copy it without duplication.
					arr[length_] = 0;
					length_ -= 1;
					break;
				}
				possibleDups++;
			}
		}

		// Start backwards from the last element which would be part of new array.
		int last = length_ - possibleDups;

		// Copy zero twice, and non zero once.
		for (int i = last; i >= 0; i--) {
			if (arr[i] == 0) {
				arr[i + possibleDups] = 0;
				possibleDups--;
				arr[i + possibleDups] = 0;
			} else {
				arr[i + possibleDups] = arr[i];
			}
		}
	}

}
