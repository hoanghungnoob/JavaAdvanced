package OOP;

import java.util.Scanner;

public class BubbleSort {
	//bubble sort array[n]
	    public void bubbleSort(int arr[]) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	        }
	    }
	    // method input element of array[n]
	    public void input(int arr[]) {
	    	Scanner in =new Scanner(System.in);
	    	for (int n =0;n<arr.length;n++) {
	    		int a =in.nextInt();
	    		arr[n]=a;
	    	}
	    }
	    //method print array[n]
	    public void printArray(int arr[]) {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter num element of array");
		int number =ip.nextInt();
		int arr[] = new int[number];
		BubbleSort obj1=new BubbleSort();
		obj1.input(arr);
		System.out.print("Unsorted array: ");
		
		obj1.printArray(arr);
		System.out.println();
		obj1.bubbleSort(arr);
		System.out.print("Sorted array: ");
		obj1.printArray(arr);
	}

}
