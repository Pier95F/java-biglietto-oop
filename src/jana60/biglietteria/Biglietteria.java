package jana60.biglietteria;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		
		// Importo lo scanner per richiedere gli input all'utente
		Scanner scan = new Scanner(System.in);

		System.out.println("Benvenuto nel servizio di biglietteria!");
		// Chiedo all'utente di inserire l'età del passeggero
		System.out.println("Inserisci la tua età: ");
		int eta = scan.nextInt();
		// Chiedo all'utente di inserire i km da percorrere
		System.out.println("Inserisci i km da percorrere: ");
		double km = scan.nextDouble();
		
		
		Biglietto biglietto = new Biglietto (eta, km);
		
		// Stampo a video il prezzo finale del biglietto
		System.out.println("Il prezzo del biglietto è: " + biglietto.prezzoFormattato());
		
		
		scan.close();

}
}