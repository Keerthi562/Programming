package arrays;

import java.util.Scanner;

public class ArrayElementsProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[]a=new int[n];
		int prod=1;
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			prod=prod*a[i];
		}
		System.out.println("Product of array elements are: "+prod);
		
	}

}

