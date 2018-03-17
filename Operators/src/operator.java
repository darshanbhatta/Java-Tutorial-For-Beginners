/**

 * @author  Darshan
 * @youtube youtube.com/DarshPlanet

 */

public class operator {

	public static void main(String[] args) {
		
		//arithmetic ops
		
		int i = 50;
		int i2 = 4;
		
		System.out.println(i+i2);
		System.out.println(i-i2);
		System.out.println(i*i2);
		System.out.println((double)i/i2);
		System.out.println(i%i2);
		i2++;
		System.out.println(i2);
		i2--;
		i2--;
		System.out.println(i2);
		
		
		
		//relational ops
		
		System.out.println(i==i2);
		System.out.println(i!=i2);
		System.out.println(i>i2);
		System.out.println(i<i2);
		System.out.println(i>=i2);
		System.out.println(i<=i2);
		
		//assignment ops
		
		int ii = 5;
		i+=i2; // i = i+i2;
		i-=i2; // i = i+i2;
		i*=i2; // i = i+i2;
		i/=i2; // i = i+i2;
		i%=i2; // i = i+i2;
		
		
		
		//logical ops
		
		int num = 5;
		System.out.println(num!=5&&num>0);
		System.out.println(num!=5||num>0);
		System.out.println(!(num!=5||num>0));
		
	}

}
