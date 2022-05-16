package arrayProblems;

public class LeftRotationArray2 {
	
	public static void main(String args[]) {
		
		int array1[ ] = new int [] {1,2,3,4,5};
		
		int n=3;
		
		System.out.println("Orignal Array");
		
		for(int i =0; i <array1.length; i++) {
			
			System.out.print(array1[i] + " ");
			
		}
		
		for(int i =0; i < n; i++) {
		
		int j,first;
		first = array1[0];
		for( j=0;j<array1.length -1;j++) {
			
			array1[j] = array1[j+1];		
		}
		array1[j] = first;
		}
		System.out.println();
		
		System.out.println("New Array after left rotation");
		
		for(int i =0; i < array1.length; i++) {
			
			System.out.print(array1[i] + " ");
			
		}
		
	}

}
