package arrays;

public class frequencyOfArray {
	
	public static void main(String[] args) {
		
		int[] a = {10,10,50,20,70,50,70,70,80};
		
		boolean[] b = new boolean[a.length];
		
		for(int i=0; i<a.length; i++) {
			
			int count = 1;
			
			if(b[i] == false) {
				
				for(int j = i+1; j<a.length; j++) {
					
					if(a[i] == a[j]) { 
						count++;
						b[j] = true;
					}
				}
				
				System.out.println(a[i]+" occoured "+count+" times");
			}
		}
	}
}
 