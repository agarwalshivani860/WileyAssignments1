package com.week2.exe;

import java.util.*;

import com.week2.exercise.CreateMatrix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rowsize: ");
		int rowSize = sc.nextInt();
		System.out.println("Enter colsize: ");
		int colSize = sc.nextInt();
		CreateMatrix c = new CreateMatrix(rowSize, colSize);

		int[][] A = new int[rowSize][colSize];
		int[][] B = new int[rowSize][colSize];
		System.out.println("Enter Array A");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Array B");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		c.twoArray(A, B);
		int C[][] = c.add();

		c.displayMatrix(C);

	}

}
