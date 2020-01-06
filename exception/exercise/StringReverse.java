package exception.exercise;

class StringReverse {
	public static void main(String... args) {
		try {
			reverse("abcdefg");
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			System.out.println("End Of Program");
		}
	}
	static void reverse(String s) throws Exception{
		if(s.length()>0) {
			System.out.println("reverse String is : "+new StringBuilder(s).reverse());
		} else {
			throw new Exception("Invalid String");
		}
	}
}	

