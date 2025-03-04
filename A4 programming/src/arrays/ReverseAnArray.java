package arrays;
import java.util.Scanner;
public class ReverseAnArray {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=s.nextInt();
	System.out.println("Enter the elements of the array");
	int []a=new int[size];
	for(int k=0;k<a.length;k++){
	a[k]=s.nextInt();
	}
	System.out.println("Before reversing the array");
	for (int num : a) {
		System.out.println(num);
	}
	int i=0;
	int j=a.length-1;
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	System.out.println("After reversing the array");
	for (int num : a) {
		System.out.println(num);
	}
	}
}
