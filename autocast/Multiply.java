package autocast;

public class Multiply {
	public static void main(String... args) {
		/**
		 * Multiply static values to store in int
		 */
		int a = 5 * 6;
		System.out.println("Value of a is:"+a);
		/**
		 * Multiply 2 int and store value in int
		 */
		int b = 5;
		int c = 6;
		a = b * c;
		System.out.println("Value of a is:"+a);
		/**
		 * Multiply 2 short and store value in short
		 */
		short e = 5;
		short f = 6;
		//short d = e *f ;
		//System.out.println("Value of d is:"+d);
		/**
		 * Multiply 2 big int and store value in int
		 */
		b = 2_147_483_647;
		c = 6;
		a = b * c;
		System.out.println("Value of a is:"+a);
	}
}
