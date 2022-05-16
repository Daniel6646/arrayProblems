package arrayProblems;

public class ThirdLargestNumberArray {
  
		public static int getThirdLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-3];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		
		/* here in the above array a
		 * sorted array  int a [] = {1,2,2,3,5,6} total - 3 is 6-3 that is 3 so 3 here is index starting from 0 so 6-3 is 3 so starting from 0 3rd element is the third largest
		 * int b[] = {22,33,44,55,66,77,99} total- 3 = 7-3 is 4 , starting from 0 to 4th index is 66 so its the third largest nuber */
		 
		System.out.println("Third Largest: "+getThirdLargest(a,6));  
		System.out.println("Third Largest: "+getThirdLargest(b,7));  
		}}  