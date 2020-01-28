package incr;

public class PrePostIncr {
	public static void main(String args[]) {
		int p = 1;
		p = p++ + --p;
		System.out.println(p);
	}
}
