public class BubbleSort{

	public static int[] bubbleSort(int[] array){

		for (int i = array.length - 1; i > 0 ; i-- ) {
			for (int j = 0; j < i ; j++ ) {
				if (array[j] > array[j + 1]) {
					array = swap(array, j, j+1);
				}
			}	
		}
		return array;
	}

	private static int[] swap(int[] array, int posFirst, int posSecond){
		int temp = array[posFirst];
		array[posFirst] = array[posSecond];
		array[posSecond] = temp;

		return array;
	}
}