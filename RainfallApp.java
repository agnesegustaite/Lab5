import java.text.DecimalFormat;
import java.util.*;

public class RainfallApp {
	
	public static void main(String[] args) {
		//declare 2D[]
		double rainfall[][];
		//set the size for 4 weeks, 7 days
		rainfall = new double[4][7];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of weeks: ");
		int weeks = sc.nextInt();
		
		System.out.println("Number of days per week: ");
		int days = sc.nextInt();
		
		//create a 2D[] with as many rows as user provided for weeks
		//as many columns as user provided for days
		rainfall = new double[weeks][days];
		
		//input
		//traverse the 2D[] by using loop
		//store the values provided by the user
				
		for(int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
			System.out.print("Please enter rainfall value for week " + (row+1) + " day " + (col+1) + ": ");
			rainfall[row][col] = sc.nextDouble();
			}
		}//end for
		
		//processing
		RainfallAvgMaxMin myRain = new RainfallAvgMaxMin();
		myRain.setRainfall(rainfall);
		myRain.calcMax();
		myRain.calcMin();
		myRain.calcAvg();
		
		//output
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Max is: " + df.format(myRain.getMax()));
		System.out.println("Min is: " + df.format(myRain.getMin()));
		System.out.println("Average is: " + df.format(myRain.getAverage()));
		
	}//end main
}//end class