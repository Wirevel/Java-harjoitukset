package kes�harjoitus2;

public class BensaTankki {
	private int tilavuus;
	private double bensanMaara;
	
	public BensaTankki(int tilavuus, double bensanMaara) {
		this.tilavuus=tilavuus;
		this.bensanMaara=bensanMaara;
	}
		public void Tulosta() {
			System.out.println("BensaTankin tilavuus on "+ tilavuus+", ja siell� on "+bensanMaara+" litraa bensaa.");
		}
	

}
