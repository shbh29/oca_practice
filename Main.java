import java.util.*;

abstract class Ab {
	static int x;
	static String isStaticMethodInherited(){return "it is Inherited";}
//	Ab(int x){ this.x=x;}
}


class Main extends Ab{
	Main(int x){
		//super(5);
		//
		super.x = 10;
	}
	
	static String isStaticMethodInherited(){return "it is Inherited and Overridden ";}
	public static void main(String[] args){
		Main obj = new Main(5);
		System.out.println(x);
		System.out.println(obj.isStaticMethodInherited());

//		int[] iarr;
//		short[] sarr = {2,4,6};
//		iarr = sarr;
//		System.out.println(Arrays.toString(iarr));
	}
}
