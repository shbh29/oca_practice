package access;

class Chair {
	protected void sit(){
		System.out.println("sat");
	}
	public String material = "plastic";
}

class Dine extends Chair {
	public void dine(){
		sit();
		Chair c = new Chair();
		c.sit();
	}
}


public class Instance {
	public static void main(String[] args){
		Dine inst = new Dine();
		inst.dine();
		Chair c = new Chair();
		c.sit();
	}
}
