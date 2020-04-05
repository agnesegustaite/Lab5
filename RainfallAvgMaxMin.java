public class RainfallAvgMaxMin {
	
	private double rainfall[][];
	private double max;
	private double min;
	private double average;
	
	public RainfallAvgMaxMin() {
	}

	//setter
	public void setRainfall(double[][] rainfall) {
		this.rainfall = rainfall;
	}
	
	//getter
	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}

	public double getAverage() {
		return average;
	}
	
	public void calcMax() {
		max = rainfall[0][0];
		
		for(int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				if(max < rainfall[row][col]) {
			    max = rainfall[row][col]; 
			    } //end if
			}//end inner loop
		}//end outer loop
	}
	
	public void calcMin() {
	min = rainfall[0][0];
	
		for(int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				if(min > rainfall[row][col]) {
				min = rainfall[row][col]; 
				} //end if
			}//end inner loop
		}//end outer loop
	}
	
	public void calcAvg() {
	double sum = 0;
	int counter = 0;
	
		for(int row = 0; row < rainfall.length; row++) {
			for(int col = 0; col < rainfall[row].length; col++) {
				sum = sum + rainfall[row][col];
				counter++;
			}//end inner loop
		}//end outer loop
		
		//compute the average of all the elements in the []
		average = sum/counter;
	}
	
}//end class