package Arrays;

public class MinValueInArray {

	public static void main(String[] args) { 
		  
		                                                                         //Initialize array  
		        int [] arr = new int [] {25, 15, 7, 75, 56,2};  
		                                                                        //Initialize minimum with first element of array.  
		        int min = arr[0];  
		                                                                       //Looping   
		        for (int i = 0; i < arr.length; i++) {  
		                                                                      //Compare elements of array with minimum  
		           if(arr[i] <min)  
		               min = arr[i];  
		        }  
		        System.out.println("Smallest element present in given array: " + min);  
		    }  
		}  
	
