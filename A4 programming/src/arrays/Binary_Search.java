// to do binary search the array should be sorted in ascending order
// or descending order, the below program(algorithm) will work only 
// when array is sorted in ascending order


package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter Size Of Array: ");
		int n=p.nextInt();

		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value: ");
			a[i]=p.nextInt();
		}
		Arrays.sort(a);

		System.out.println();
		System.out.print("Enter the element to be found: ");
		int k=p.nextInt();

		int l=0,h=a.length-1,c=0;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(k==a[mid])
			{
				c++;
				break;
			}
			else if(k>a[mid]) 
			{
				l=mid+1;
			}
			else
			{
				h=mid-1;
			}
		}

		if(c>0)
		{
			System.out.println(k+" is found in array");
		}
		else
			System.out.println(k+" is not found in array");
	}
}

