package arrayProblems;

public class LargestArray {
	
	public static void main(String args[]) {
	int arr [] = new int[] {50,40,76,82};
	
	
	//int max = arr[0];
	 int max = arr[0];  
	
	for(int i = 0; i < arr.length; i++) {
		
		if(arr[i] > max) {
			
			max = arr[i];
			
		}
		
	}
	
	System.out.println("Largest array is " +max);
	
	}

}