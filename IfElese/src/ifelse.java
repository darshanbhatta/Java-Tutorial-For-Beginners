/**

 * @author  Darshan
 * @youtube youtube.com/DarshPlanet

 */

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int grade = 50;
		char letterGrade;

		//program prints out a letter grade using if statements, grade is assigned inside the int called grade
		if(grade<0||grade>100) {
			letterGrade = 'O';

		} else if(grade>=90) {

			letterGrade = 'A';

		}else if(grade>=80) {

			letterGrade = 'B';

		}else if(grade>=70) {

			letterGrade = 'C';

		}else if(grade>=60) {

			letterGrade = 'D';

		}else {

			letterGrade = 'F';

		}
		System.out.println("The grade " + grade + " equals letter grade of " + letterGrade );





	}

}
