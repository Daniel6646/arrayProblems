package arrayProblems;

public class EvenPosition {  
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
  
        System.out.println("Elements of given array present on even position: ");  
        //Loop through the array by incrementing value of i by 2  
        //Here, i will start from 1 as first even positioned element is present at position 1.  
        //foe eg here we have to add in index to get the even number
        //i = i+2 here i=1 index has 2 so print it
        //(index starting from 0, 
        //next i=1 so i =i+2(1+2 =3 )
        //so we have index 3 which has element 4 so we get the result we move by adding index to get even elements in the array.
        for (int i = 1; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
}  