public class SelectionSort{

	public static int[] selectionSort(int[] array){

		for (int i = 0; i < array.length - 1 ; i ++ ) {
			int minIndex = i;
			for (int j = i + 1; j < array.length ; j++ ) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			array = swap(array, i, minIndex);

		}
	}

	private static int[] swap(int[] array, int posFirst, int posSecond){
		int temp = array[posFirst];
		array[posFirst] = array[posSecond];
		array[posSecond] = temp;

		return array;
	}
}