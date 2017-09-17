/**
 * A class that implements Binary search algorithm
 */

public class BinarySearch{

	public static String binarySearch(int[] array, int element){

		int upperbound = array.length - 1;
		int lowerbound = 0;
		int middle;

		while(upperbound > lowerbound){
		 	middle = lowerbound + (upperbound - lowerbound) / 2;
		 	if (element == array[middle]) {
				return "Element found at position: " + middle;
			}
			if(element < array[middle]){
				upperbound = middle - 1;
			}else if (element > array[middle]){
				lowerbound = middle + 1 ;
			} 
		}
		return "Done. Item not found";	
	}
}