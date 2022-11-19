package pgdp.megamerge;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MegaMergeSort {

	/**
	 * Sorts the array using mega merge sort with div splits
	 * @param array the array to be sorted
	 * @param div the split factor
	 * @return the sorted array
	 */
	protected int[] megaMergeSort(int[] array, int div) {
		return megaMergeSort(array, div, 0, array.length);
	}

	/**
	 * Sorts the array using mega merge sort with div splits in the defined range
	 * @param array the array to be sorted
	 * @param div the split factor
	 * @param from the lower bound (inclusive)
	 * @param to the upper bound (exclusive)
	 * @return the sorted array
	 */
	protected int[] megaMergeSort(int[] array, int div, int from, int to) {
		// TODO
		return null;
	}

	/**
	 * Merges all arrays in the given range
	 * @param arrays to be merged
	 * @param from lower bound (inclusive)
	 * @param to upper bound (exclusive)
	 * @return the merged array
	 */

	static int i = 0;
	static int y = 1;
	protected int[] mergeHey(int[][] arrays, int from, int to) {

		if ((i < (to - from) - 1) || to - from == 1) {
			if (i != 0) {
				arr = merge(arr, arrays[to - y]);
				y++;
				i++;
				return mergeHey(arrays, from, to);
			}
			else if (i == 0 && to - from != 1) {
				arr = merge(arrays[to - y], arrays[to - (y + 1)]);
				i++;
				y += 2;
				return mergeHey(arrays, from, to);
			}
			else {
				return arrays[to - 1];
			}
		}
		else {
			return arr;
		}
	}

	static int[] arr;
	protected int[] merge(int[][] arrays, int from, int to) {
		// TODO
		arr = new int[0];
		return mergeHey(arrays, from, to);
	}

	/**
	 * Merges the given arrays into one
	 * @param arr1 the first array
	 * @param arr2 the second array
	 * @return the resulting array
	 */
	protected int[] merge(int[] arr1, int[] arr2) {
		// TODO
		int[] newarr = new int[arr1.length + arr2.length];
		int arr1x = 0;
		int arr2y = 0;
		int newArrayz = 0;
		while (arr1x < arr1.length && arr2y < arr2.length) {//Geht nur so lange bis index out of bounce
			if (arr1[arr1x] < arr2[arr2y]) {
				newarr[newArrayz] = arr1[arr1x];
				newArrayz++;
				arr1x++;
			}
			else {
				newarr[newArrayz] = arr2[arr2y];
				newArrayz++;
				arr2y++;
			}
		}
		//letzten Lücken füllen
		if (arr1x < arr1.length) {
			for (int i = arr1x; i < arr1.length; i++) {
				newarr[newArrayz] = arr1[arr1x];
				newArrayz++;
				arr1x++;
			}
		}
		if (arr2y < arr2.length) {
			for (int i = arr2y; i < arr2.length; i++) {
				newarr[newArrayz] = arr2[arr2y];
				newArrayz++;
				arr2y++;
			}
		}

		return newarr;
	}

	public static void main(String[] args) {
		MegaMergeSort mms = new MegaMergeSort();
		//int[] arr = new int[] { 1, 2, 6, 7, 4, 3, 8, 9, 0, 5 };
		//int[] arr1 = new int[] {1, 3};
		//int[] arr2 = new int[] {2, 4};
		int[][] arr2d = new int[][] {
				{1}, {2, 3}, {3}, {4}
		};
		int[] res = mms.merge(arr2d, 7, 6);
		System.out.println(Arrays.toString(res));
	}
}
