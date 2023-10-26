package Array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {
				{1,2,3,4},
				{2,5,7,9},
				{8,7,5,6}
		};
//		length of array a
		System.out.println(a.length);
//		using tw0 for
		
		
//		using foreach
		System.out.println("list of array");
		for (int [] row:a) {
			for (int x : row) {
				System.out.print(x+" ");
			}
			System.out.println();
			
		}
//		using tostring
		System.out.println("Using deeptoString(a)");
		System.out.println(Arrays.deepToString(a));
		}
	

}
