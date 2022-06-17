package jana60.biglietteria;

import java.text.DecimalFormat;

public class Biglietto {

		// Definisco gli attributi della classe
		private int eta, km;
		private double prezzoKm = 0.21, scontoUnder = 0.2, scontoOver = 0.4;
		
		DecimalFormat df = new DecimalFormat("#.## €");

		// Costruttori
		public Biglietto(int eta, int km) {
			super();
			this.eta = eta;
			this.km = km;
		}
		
		// Imposto i getter
		public int getKm(int km) {
			this.km = km;
			return km;
		}
		
		public int getEta (int eta) {
			this.eta = eta;
			return eta;
		}
		
		// Metodi
		
}
