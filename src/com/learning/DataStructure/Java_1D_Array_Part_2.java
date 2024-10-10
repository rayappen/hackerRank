package com.learning.DataStructure;

import java.util.Scanner;

public class Java_1D_Array_Part_2 {

	public static boolean canWin(int leap, int[] game) {
		
		return checkWin(leap, game, 0);
	}
	
	public static boolean checkWin(int leap, int[] game, int destinationIndex)
	{
		if(destinationIndex >= game.length)
			return true;
		
		if(destinationIndex < 0 || game[destinationIndex] == 1)
			return false;
		
		game[destinationIndex] = 1;
		
//		boolean checkForward = checkWin(leap, game,destinationIndex + 1);
//		boolean checkleap = checkWin(leap, game,destinationIndex + leap);
//		boolean checkBackward = checkWin(leap, game,destinationIndex - 1);
//		
//		
//		game[destinationIndex] = 0;
//		
//		return checkForward || checkleap || checkBackward;
		
		return checkWin(leap, game,destinationIndex + 1) 
				|| checkWin(leap, game,destinationIndex + leap)
				|| checkWin(leap, game,destinationIndex - 1);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
			
			
		}
		scan.close();
	}

}
