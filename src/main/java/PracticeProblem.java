public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void insertionSort(char[] arr) {

		for(int i = 1; i < arr.length; i++) {
			char temp = arr[i];
			int j = i - 1;

			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}


}
