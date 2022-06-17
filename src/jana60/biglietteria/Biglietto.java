package jana60.biglietteria;

import java.text.DecimalFormat;

public class Biglietto {

		// Definisco gli attributi della classe
		private int eta;
		private double km, prezzoKm = 0.21;
		
		DecimalFormat df = new DecimalFormat("#.## €");

		// Costruttori
		public Biglietto(int eta, double km) {
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
		// Imposto il metodo per il calcolo del prezzo del biglietto
		public double prezzoBiglietto() {
			
			double prezzoBiglietto;
			prezzoBiglietto = km * prezzoKm;
			if (eta<18) { 
				double scontoUnder = 0.2;
				double bigliettoUnder= prezzoBiglietto - (prezzoBiglietto * scontoUnder);
				System.out.println("Hai diritto allo sconto del 20%");
				return bigliettoUnder;
			} else if (eta >=65) {
				double scontoOver = 0.4;
				double bigliettoOver = prezzoBiglietto - (prezzoBiglietto * scontoOver);
				System.out.println("Hai diritto allo sconto del 40%");
				return bigliettoOver;
			} else {
				return prezzoBiglietto;
			}
		}
		
		// Imposto la stringa per restituire il prezzo formattato
		public String prezzoFormattato() {
			return df.format(prezzoBiglietto());
		}
		
			
			
		}
		

