package sep26practice;

import java.util.Arrays;

public class DeleteandInsertElementsinArray {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5 };
		
		System.out.println("original  =" + Arrays.toString(numbers));
		
		int positionToDelete = 2;
		for (int pos = positionToDelete ; pos < numbers.length - 1 ; pos++) {
			numbers[pos] = numbers[pos + 1] ;
			
			System.out.println("after move = " + Arrays.toString(numbers));
			
			// make a new array that is one smaller than original
			int[] target = new int[numbers.length - 1];
			for (int pos1 = 0 ; pos1 < target.length ; pos1++ ) {
				target[pos1] = numbers[pos1];
			}
			System.out.println("after copy = " + Arrays.toString(target));
		}
	}

}
