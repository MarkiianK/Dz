package dz1;

public class dz {

	public static void main(String[] args) {
		char c = 'â';
		System.out.println(c);
		System.out.println((int)c);
		int[] array = new int[10];
		System.out.println(array[0]);
		array[0] = 5;
		array[1] = 4;
		array[9] = 5;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		int[][] matrix = new int[5][];
		matrix[0] = new int[1];
		matrix[1] = new int[2];
		matrix[2] = new int[3];
		matrix[3] = new int[4];
		matrix[4] = new int[5];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		matrix = new int[5][5];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[i].length; j++) {
				matrix[i][j] = 1;
				if(j!=i)matrix[j][i] = 2;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}