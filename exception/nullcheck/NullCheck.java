
class NullCheck {
	static String s;
	String s1;
	char c;
	int i;
	double d;
	public static void main(String args[]) {
		System.out.println(""+s);
		System.out.println(""+new NullCheck().s1);

		System.out.println(new NullCheck().c);
		System.out.println(""+new NullCheck().i);
		System.out.println(""+new NullCheck().d);
	}
}
