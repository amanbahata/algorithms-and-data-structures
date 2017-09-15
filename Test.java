public class Test{
	public static void main(String[] args) {
		int result = Gcd.gcd(3,6);
		System.out.println(result);


		//int[] unsortedArray = {2,5,7,8,12};
		int[] unsortedArray = {12,8,7,5,2};
		int[] unsortedArray1 = {10,2,8,6,7,3};

		int[] sortedArray = BubbleSort.bubbleSort(unsortedArray);
		int[] sortedArray1 = SelectionSort.selectionSort(unsortedArray1);






		// for (int element : sortedArray ) {
		// 	System.out.print(element + ", ");
		// }

		for (int element : sortedArray1 ) {
			System.out.print(element + ", ");
		}

	}
}