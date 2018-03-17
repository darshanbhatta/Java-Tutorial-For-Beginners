/**

 * @author  Darshan
 * @youtube youtube.com/DarshPlanet

 */

package mathclass;


public class mathclass {


	public static void main(String[] args) {

		double pi = Math.PI;
		System.out.println(pi);

		int neg = -55;
		System.out.println(Math.abs(neg)); // does the absolute value of a number
		double n = 5.8;
		System.out.println(Math.ceil(n)); //round any number up
		System.out.println(Math.floor(n)); //round any number down
		System.out.println(Integer.MAX_VALUE); //prints out the highest integer in java: 2,147,483,647 
		System.out.println(Integer.MIN_VALUE); //prints out the highest integer in java: -2,147,483,648

		System.out.println(Math.pow(99, 56)); //does 99^56 (99 to the power 56)

		//Random number generator formula: Math.random()*(range+1)+min
		for(int x =0; x<10;x++) {

			System.out.print((int)(Math.random()*(100))+1 + " "); //prints out a random number between 1 and 100


		}
		System.out.println();
		double round = 5.5;
		System.out.println(Math.round(round)); //round a number normally, E.g: 5.5 returns 6 and 5.4 returns 5

		int sqrt = 81;
		System.out.println(Math.sqrt(sqrt)); //does the square root of a number (in this case it returns 9)

	}

}
