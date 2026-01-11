package h3;

public class H3_main {

	public static void main(String[] args) {
		int[] unsorted = { 8, 3, 7, 2, 3 };
		int[] unsorted2 = { 2 };
		int[] unsorted3 = { 3, 1 };
		int[] unsorted4 = { 1, 2, 3, 19, 8, 13 };

		runtMergeSort(unsorted);
		runtMergeSort(unsorted2);
		runtMergeSort(unsorted3);
		runtMergeSort(unsorted4);
	}

	public static int[] mergeSort(int[] list) {
		if (list.length <= 1)
			return list;

		// Split array into two parts
		int centerIndex = list.length / 2;
		if (list.length == 2) {
			centerIndex = 0;
		}

		int[] leftHalf = new int[centerIndex + 1];
		for (int i = 0; i <= centerIndex; i++) {
			leftHalf[i] = list[i];
		}
//		printArray(leftHalf);
		leftHalf = mergeSort(leftHalf);

		int[] rightHalf = new int[list.length - 1 - centerIndex];
		for (int i = 0; i < rightHalf.length; i++) {
			rightHalf[i] = list[centerIndex + 1 + i];
		}
//		printArray(rightHalf);
		rightHalf = mergeSort(rightHalf);

		// Merge
		int[] sortedList = new int[leftHalf.length + rightHalf.length];
//		printArray(sortedList);
//		printArray(leftHalf);
//		printArray(rightHalf);

		int leftIndex = 0;
		int rightIndex = 0;
		int sortedIndex = 0;
		while (sortedIndex < sortedList.length) {
			if (leftIndex >= leftHalf.length && rightIndex < rightHalf.length) {
				sortedList[sortedIndex] = rightHalf[rightIndex];
				rightIndex++;
				sortedIndex++;
			} else if (rightIndex >= rightHalf.length && leftIndex < leftHalf.length) {
				sortedList[sortedIndex] = leftHalf[leftIndex];
				leftIndex++;
				sortedIndex++;
			} else {
				if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
					sortedList[sortedIndex] = leftHalf[leftIndex];
					leftIndex++;
					sortedIndex++;
				} else {
					sortedList[sortedIndex] = rightHalf[rightIndex];
					rightIndex++;
					sortedIndex++;
				}
			}

//			printArray(sortedList);
//			System.out.println(sortedIndex);
//			printArray(leftHalf);
//			System.out.println(leftIndex);
//			printArray(rightHalf);
//			System.out.println(rightIndex);
		}

		return sortedList;
	}

	public static void runtMergeSort(int[] unsorted) {
		System.out.println("Unsorted array:");
		printArray(unsorted);

		int[] sorted = mergeSort(unsorted);

		System.out.println("Sorted array:");
		printArray(sorted);

		System.out.println();
		System.out.println();
	}

	public static void printArray(int[] list) {
		System.out.print("[");

		for (int e : list) {
			System.out.print(" " + e);
		}

		System.out.println(" ]");
	}
}
