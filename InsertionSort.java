public class InsertionSort{
	public static int[] insertionSort(int[] array){


		return array;
	}

	private static int[] swap(int[] array, int posFirst, int posSecond){
		int temp = array[posFirst];
		array[posFirst] = array[posSecond];
		array[posSecond] = temp;

		return array;
	}
}