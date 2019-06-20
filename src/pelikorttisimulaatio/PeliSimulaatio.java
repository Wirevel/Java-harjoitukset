package pelikorttisimulaatio;

public class PeliSimulaatio {
	public static void main(String[]args) {
		Kortti kortti1 = new Kortti();
		Kortti kortti2 = new Kortti();
		Kortti kortti3 = new Kortti();
		
		if(kortti1.onSuurempi(kortti2)) {
			System.out.println(kortti1+"on suurempi kuin "+ kortti2);
		}
		
	}

}
