package arrayProblems;

public class OddPosition {  
    public static void main(String[] args) {  
        //Initialize array  
       int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array present on odd position: ");  
        //Loop through the array by incrementing value of i by 2  
        // if confused see EvenCountArray program for explanatiion
        for (int i = 0; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
}  


Elements of given array present on odd position: 
1
3
5
