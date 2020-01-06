package lambda;

import java.util.*;
import java.util.function.Predicate;
class TryPredicate {
	public static void main(String... args) {
		/**
		 * Algo.
		 * 1. create a function that accepts predicate as parameter.
		 * 2. array list of numbers from argument
		 * 3. print odd number in list if last element is odd else print even number of list
		 */
		List<Integer> arrLst = new ArrayList<>();
		for (int i=0; i<args.length; i++) {
			arrLst.add(new Integer(args[i]));
		}
		if(arrLst.get(arrLst.size()-1)%2==0) {
			System.out.print("\n Even Numbers are: ");
			go(arrLst, (x) -> x%2==0 );
		} else {
			System.out.print("\n Odd Numbers are: ");
			go(arrLst, (x) -> x%2!=0);
		}
	}
	static void go(List<Integer> arrLst, Predicate<Integer> p) {
		for(Integer e: arrLst) {
			if (p.test(e)){
				System.out.print(e+ " ");
			}
		}
	}
}	
