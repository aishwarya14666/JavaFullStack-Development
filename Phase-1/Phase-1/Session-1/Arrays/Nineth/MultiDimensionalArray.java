package Nineth;

import java.util.Scanner;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int array1[][]=new int [3][3];
		int array2[][]=new int [3][3];
		Scanner sc=new Scanner(System.in);
		//accessing elements of 1st matrix
		for(int row1=0;row1<3;row1++) {
			for(int col1=0;col1<3;col1++) {
				System.out.print("Enter the elements of 1st matrix:");
				array1[row1][col1]=sc.nextInt();
			}
			System.out.println();
		}
		
		//displaying elements of 1st matrix
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array1[i][j]+"\t");
			}
			System.out.println();
		}
		//accessing elements of 2nd matrix
		for(int row2=0;row2<3;row2++) {
			for(int col2=0;col2<3;col2++) {
				System.out.print("Enter the elements of 2nd matrix:");
				array2[row2][col2]=sc.nextInt();
			}
			System.out.println();
		}
		//displaying elements of 2nd matrix
		for(int k=0;k<3;k++) {
			for(int l=0;l<3;l++) {
				System.out.print(array2[k][l]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
