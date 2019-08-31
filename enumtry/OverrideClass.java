package enumtry;

enum ColdDrink {
	Cola(5),
	SPRITE(2),
	MAAZA(6) {
		int getRank(){
			return rank - 2;
		}
	};
	int rank;
	ColdDrink(int rank){
		this.rank = rank;
	}
	int getRank(){return 0;}
}

public class OverrideClass {
	public static void main (String[] args) {
		for(ColdDrink cd : ColdDrink.values()){
			System.out.println("Order: "+ cd.name());
			if(cd.name().equals("MAAZA")){
				System.out.println("\t Rank: "+cd.getRank());
			}
		}
	}
}

