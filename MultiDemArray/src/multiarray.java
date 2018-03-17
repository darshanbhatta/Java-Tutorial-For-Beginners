/**

 * @author  Darshan
 * @youtube youtube.com/DarshPlanet

 */

import java.util.Arrays;

public class multiarray {
	public static void main (String[] args) {
		int[][] test = {{1,2,3},{4,5,6},{7,8,9}}; //initializing a multidimensional array with known values

		//traversing through a multidimensional array and printing out the values, outer for loop are rows and inner are columns
		for(int r=0;r<test.length;r++) {
			for(int c=0;c<test[0].length;c++) {
				System.out.print(test[r][c] + " ");


			}
			//print statement here for row change
			System.out.println();
		}

		
		int[][] nt = new int[9][10]; //initializing a multidimensional array with unknown values, all values inside this are 0: first number inside brackets
		for(int r=0;r<nt.length;r++) {
			for(int c=0;c<nt[0].length;c++) {
				nt[r][c]=(r+1)*(c+1); //assigning value to multidimensional array
				System.out.print(nt[r][c] + " ");


			}

			System.out.println();
		}

		int[][][] td = new int[6][6][6];

		for(int h=0;h<td.length;h++) {
			for(int w=0;w<td.length;w++) {
				for(int l=0;l<td.length;l++) {
					td[h][w][l]=h*2*l;
					System.out.print(td[h][w][l] + " ");



				}	
				System.out.println();

			}
			System.out.println();

		}





	}


}
