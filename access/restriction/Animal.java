package access.restriction;

public class Animal {
	private void eat(){
		System.out.println("eating Generically");
	}
}

class Horse extends Animal{
	protected void eat(){
		System.out.println("eating like horse");
	}
}
