package staticCheck;

public class Variable {
	private static boolean heatWave = true;
	private static String abc;
	public static void main(String... args){
		boolean heatWave = false;
		System.out.println(heatWave);
		System.out.println("String default Value:"+abc);
		System.out.println("Concat NUll: "+abc+"");
		int underScore$Number=123_456_4090;
		System.out.println("underScoreNumber: "+underScore$Number);
	}
}
