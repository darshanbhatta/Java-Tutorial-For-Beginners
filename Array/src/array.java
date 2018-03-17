/**

 * @author  Darshan
 * @youtube youtube.com/DarshPlanet

 */




import java.util.Arrays;

public class array {

	public static void main(String[] args) {

		int[] iArray = new int[10]; //Initializes it without nums I.E: all numbers within this array are 0
		int[] iArray2 = {1,2,3,4,5,6,7,8}; ////Initializes it with nums I.E: all numbers correspond with the numbers inside the brackets
		System.out.println("Before " + Arrays.toString(iArray2)); //way of printing the array
		iArray2[5] = 90; //assigning value to an array at a specific index
		System.out.println("After " + Arrays.toString(iArray2)); //way of printing the array

		//this for loop is used to traverse through all the indexes in the array
		for(int i =0;i<iArray2.length;i++) {

			System.out.print(iArray2[i] + " "); //prints out the array at a specific index


		}





	}
}
