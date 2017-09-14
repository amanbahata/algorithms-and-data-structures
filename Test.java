public class Test{
	public static void main(String[] args) {
		int result = Gcd.gcd(3,6);
		System.out.println(result);


		//int[] unsortedArray = {2,5,7,8,12};
		int[] unsortedArray = {12,8,7,5,2};
		int[] sortedArray = BubbleSort.bubbleSort(unsortedArray);


		for (int element : sortedArray ) {
			System.out.print(element + ", ");
		}

	}
}