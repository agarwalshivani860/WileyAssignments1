package com.week2.exercise;

import java.util.*;

public class CreateMatrix {
	static int rowSize, colSize;
	static int[][] Arr;
	static int[][] Barr;

	public CreateMatrix(int rowSize, int colSize) {
		this.rowSize = rowSize;
		this.colSize = colSize;
	}

	public static void twoArray(int[][] A, int[][] B) {
		Arr = new int[rowSize][colSize];
		Barr = new int[rowSize][colSize];
		for (int i = 0; i < rowSize; i++)
			for (int j = 0; j < colSize; j++)
				Arr[i][j] = A[i][j];
		for (int i = 0; i < rowSize; i++)
			for (int j = 0; j < colSize; j++)
				Barr[i][j] = B[i][j];

	}

	public static int[][] add() {

		int C[][] = new int[rowSize][colSize];

		for (int i = 0; i < rowSize; i++)
			for (int j = 0; j < colSize; j++)
				C[i][j] = Arr[i][j] + Barr[i][j];

		return C;
	}

	public void displayMatrix(int M[][]) {
		System.out.println("Resultant Matrix");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

}
