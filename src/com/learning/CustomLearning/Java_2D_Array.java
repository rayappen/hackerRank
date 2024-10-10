package com.learning.CustomLearning;

public class Java_2D_Array {
	
	public static void main(String[] args) {
		
		int [][]mat = { {1, 2, 3, 0, 0}, { 0, 0, 0, 0, 0 }, { 2, 1, 4, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1, 0 } };
		
//		for(int i = 0; i < mat.length; i++)
//		{
//			for(int j = 0; j < mat[i].length; j++)
//			{
//				System.out.print(mat[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				
				if(i == 1 && (j == 0 || j == 2))
				{
					System.out.print("  ");
					continue;
				}
				System.out.print(mat[i][j] + " " );
				
			}
			System.out.println();
		}
	}

}
