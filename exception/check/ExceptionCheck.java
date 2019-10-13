package exception.check; 
import java.io.IOException;


public class ExceptionCheck extends ThrowException {
	ExceptionCheck() throws IOException{
		/*
		 * this won't work as super should be first line of function
		 */
		/*
		try{
			super();
		} catch (IOException ex){
			ex.printStackTrace();
		}*/
		System.out.println("No Risk in Constructor");
	}
	public void overriding() {
		try{
		super.overriding();
		} catch (IOException ex){
			ex.printStackTrace();
		}
		System.out.println("No Risk in Overriding method");
	}
       	public static void main(String ... args) throws IOException{
		new ExceptionCheck().overriding();
	}
}

class ThrowException {
	ThrowException() throws IOException{
		throw new IOException("thrown from Constructor");
	}
	public void overriding() throws IOException{
		throw new IOException("Purposfully thrown");
	}
}
