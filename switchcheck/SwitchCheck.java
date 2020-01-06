package switchcheck;

class SwitchCheck {
	public static void main(String ...args) {
		int ch = 2;
		switch (ch) {
			case 0: System.out.println("before BReak:0"); break; //System.out.println("After BReak");

			default: System.out.println("Default");
			case 2: System.out.println("before BReak:2"); break; //System.out.println("After BReak");
			case 3: System.out.println("before BReak:3"); break; //System.out.println("After BReak");
		}
		
	}
}
