import java.text.DecimalFormat;
import java.util.*;
public class RainfallAvgApp {

	public static void main(String[] args) {
		//declare and create 2D[] with 4 weeks(rows) 7 day(col)
		int rainfall[][] = new int [4][7];
		
		//input
		Scanner sc = new Scanner(System.in);
		
		//ask the user to input data
		//traverse the 2D[] by using outer and inner loops
		//store the values provided by the user
		for(int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				System.out.println("enter value for week: " 
			                       + (row+1) + " day " 
						           + (col+1) + ":");
				//read the value entered by the user and save it in 2D[]
				rainfall[row][col] = sc.nextInt();	
			}
		}
		//processing
		//calculate the sum of all elements of the []
		//how many elements the [] contains
		
		int sum = 0;
		int counter = 0; //the number of elements in the 2D[]
		double average;
		
		for(int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				//add the current element from the [] rainfall to the sum
				sum = sum + rainfall[row][col];
				
				//another element has been added to the sum
				//the element from [row][col]
				counter++;
			}
		}
		
		//compute the average of all the elements in the []
		average = (double)sum/counter;
		
		//output
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Average: " + df.format(average));
		
		//output the 2D[] - the data the user entered
		System.out.println("=========================");
		System.out.println("The rainfall values are: ");
		for(int row  =0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				System.out.print(rainfall[row][col] + " ");
			}
				System.out.println();
		}
		
	}
}