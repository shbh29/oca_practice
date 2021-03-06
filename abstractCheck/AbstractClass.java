package abstractCheck;

class Add implements Addable {
	public int add(int a, int b) {
		return a + 1;
	}

}

public class AbstractClass extends Add {
	public static void main(String... args){
		AbstractClass abs = new Add ();
		System.out.println("addition of 5 and 6 is: "+abs.add(5,6));
	}
	public int add(int a, int b){
		return a + b;
	}
}
interface Addable {
	int add(int a, int b);
}
