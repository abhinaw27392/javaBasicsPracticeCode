package com.java.basics;

public class SearchInMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
						  {1,2,3,4,5},
						  {6,7,8,9,10},
						  {11,12,13,14,15},
						  {16,17,18,19,20},
						 };
		boolean res = searchElement(matrix, 14);
		System.out.println(res);
		}
	
	public static boolean searchElement(int[][] matrix, int num) {
		int row = matrix.length;
		int col = matrix[0].length;
		int currentRow = 0;
		int currentCol = col - 1;
		
		while(currentRow != row && currentCol != -1) {
			if(matrix[currentRow][currentCol] == num)
				return true;
			else if(matrix[currentRow][currentCol] > num)
				currentCol--;
			else
				currentRow++;
		}
		return false;
	}

}
