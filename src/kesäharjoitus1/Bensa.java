package kesäharjoitus1;

public class Bensa {
	static double kulutus=7.5;
	static double hinta=1.582;
	static int matka=300;
	static double BensanKulutus=(kulutus*matka)/100;
	static double matkanHinta=hinta*BensanKulutus;

	public static void main(String[] args) {
		System.out.println("Bensan kulutus on "+BensanKulutus+" litraa.");
		System.out.println("Matkalle tulee hintaa "+matkanHinta+" euroa.");
		System.out.println("Matkalle tulee hintaa "+matkanHinta+" euroassss.");
	}

}
