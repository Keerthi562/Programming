package arrays;

public class NthLargestElement {
	
	public static void main(String[] args) {
		
		int[] a = {50,20,60,10,90,30,80};
		
		int n = 4;
		
		for(int i=0; i<a.length; i++) {
			
	  		int count = 1;
			
			for(int j=0; j<a.length; j++) {
				
				if(a[j] > a[i]) {
					count++;
				}
			}
			
			if(count == n) {
				System.out.println(a[i]);
			}
		}
	}
}
