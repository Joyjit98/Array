package Arrays;

public class MaxValueInArray {

	public static void main(String[] args) { 
		  
		                                                                         //Initialize array  
		        int [] arr = new int [] {25, 15, 7, 75, 56,2};  
		                                                                        //Initialize maximum with first element of array.  
		        int max = arr[0];  
		                                                                       //Looping   
		        for (int i = 0; i < arr.length; i++) {  
		                                                                      //Compare elements of array with maximum 
		           if(arr[i] >max)  
		               max = arr[i];  
		        }  
		        System.out.println("Largest element present in given array: " + max);  
		    }  
		}  
	

	
