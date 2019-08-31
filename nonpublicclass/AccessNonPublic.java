package nonpublicclass;
import nonpublicclass.NonPublic;

public class AccessNonPublic {
	public static void main (String... args) {
		NonPublic np = new NonPublic();
		System.out.println("x= "+np.x);
	}
}
