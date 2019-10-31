//this is a program literally to just do one of my linear algebra homework problems
//it would be way too much to do by hand and idk of a good program that
//would do what I want as easily as this method I just whipped up
public class Main {

	//making the array and matrix I have to multiply
	public static double[][] matrix = new double[4][4];
	public static double[] array = new double[4];
	
	public static void main(String args[]) {
		//defining the matrix for the problem
		matrix[0][0] = 0.10;
		matrix[1][0] = 0.48;
		matrix[2][0] = 0.00;
		matrix[3][0] = 0.04;
		matrix[0][1] = 0.06;
		matrix[1][1] = 0.44;
		matrix[2][1] = 0.55;
		matrix[3][1] = 0.01;
		matrix[0][2] = 0.05;
		matrix[1][2] = 0.10;
		matrix[2][2] = 0.52;
		matrix[3][2] = 0.42;
		matrix[0][3] = 0.70;
		matrix[1][3] = 0.04;
		matrix[2][3] = 0.04;
		matrix[3][3] = 0.51;
		//setting the array to be the array in the problem
		array[0] = 0.6;
		array[1] = 0.9;
		array[2] = 1.3;
		array[3] = 0.5;
		//this function just does the problem which is multiply
		//the vector with the matrix, then do it with that result, 20 times,
		//and take 1 transpose a_t so you get the total of a at each step, 
		//and plot those results against t
		sectorOutputs();
	}
	
	public static void sectorOutputs() {
		//allocating variables out here bc efficiency
		int col;
		int row;
		int t;
		int i;
		double total;
		double[] tempArray = new double[4];
		//the original array
		System.out.println("Step: 1 = 0.6,0.9,1.3,0.5, total 3.3");
		System.out.println("\n"+"---------------------------");
		//do the following 20 times
		for(t = 2; t <= 20; t++) {
			total = 0;
			//set the temp to 0
			for(i = 0; i < 4; i++) {
				tempArray[i] = 0;
			}
			//figure out what each temp is and round through matrix multiplication
			for(i = 0; i < 4; i++) {
				for(row = 0; row < 4; row++) {
					tempArray[i] += array[row]*matrix[i][row];
				}
				tempArray[i] = (Math.round(tempArray[i]*1000.0))/1000.0;
			}
			//set the temp to the actual
			for(i = 0; i < 4; i++) {
				array[i] = tempArray[i];
			}
			//calculate the total by summing the array
			for(i = 0; i < 4; i++) {
				total += array[i];
			}
			//print out results so I can copy it to my homework
			System.out.print("Step: " + t + " = ");
			for(i = 0; i < 4; i++) {
				System.out.print(array[i] + ",");
			}
			System.out.println(" total " + total);
			System.out.println("\n"+"---------------------------");
			
		}
	}
	
}
