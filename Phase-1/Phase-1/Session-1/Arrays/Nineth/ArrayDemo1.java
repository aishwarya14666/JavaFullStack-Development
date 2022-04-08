package Nineth;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int array[][]= {{2,4,7},{4,8,5},{3,5,4},{2,1,8}};
		System.out.println("Element of 2nd row 1st column="+array[1][0]);
		System.out.println("Element of 3nd row 2st column="+array[2][1]);
		for(int row=0;row<3;row++) {
			for(int column=0;column<3;column++) {
				System.out.print(array[row][column]+"\t");
			}
			System.out.println();
	}
	}

}
