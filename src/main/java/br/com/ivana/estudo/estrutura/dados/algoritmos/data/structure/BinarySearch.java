package br.com.ivana.estudo.estrutura.dados.algoritmos.data.structure;

public class BinarySearch {

	public static void main(String[] args) {

	}

	public static void binarySearch(int[] array, int x){
		binarySearchRecursive(array, x , 0, array.length-1);
		binarySearchIterative(array,x);
	}

	private static boolean binarySearchIterative(int[] array, int x) {

		int right = array.length-1;
		int left = 0;

		while( left < right ){
			int mid = left + ( right- left / 2);
			if (array[mid] == x) {
				return true;
			} else if ( array[mid] > x){
				right = mid -1;
			} else {
				left = mid +1;
			}
		}
		return false;
	}

	private static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
		if ( left> right ){
			return false;
		}
		int mid = left + ( right- left / 2);
		if (array[mid] == x) {
			return true;
		} else if ( array[mid] > x){
			return binarySearchRecursive(array, x, left, mid-1);
		}else {
			return binarySearchRecursive(array,x , mid+1, right);

		}
	}
}
