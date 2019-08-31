package finalargument;

public class PassValue {
	int x;
	void printFinal(final int a) {
		System.out.println("value of final a is "+a);
	}
	public static void main(String... args) {
		PassValue pa = new PassValue();
		int a  = 10;
		pa.printFinal(a);
		PassValue pa2 = new PassValue();
		pa2.x = 15;
		pa.printObject(pa2);
		pa2 = pa;
	}
	void printObject(final PassValue a){
		System.out.println("value of final object x is "+a.x);
		a = new PassValue();
	}
}
