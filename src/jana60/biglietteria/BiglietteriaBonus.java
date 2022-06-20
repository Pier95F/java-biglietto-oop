package jana60.biglietteria;

import java.util.Scanner;

public class BiglietteriaBonus {
	
	public static void main(String[] args) {
	
		// Importo lo scanner per richiedere gli input all'utente
		Scanner scan = new Scanner(System.in);

		System.out.println("Benvenuto nel servizio di biglietteria!");
			
		boolean finito = false;
	    while (!finito) {
		System.out.println("Inserisci la tua età: ");
		int eta = Integer.parseInt(scan.nextLine());
		// Chiedo all'utente di inserire i km da percorrere
		System.out.println("Inserisci i km da percorrere: ");
		double km = Integer.parseInt(scan.nextLine());
		
		
		Biglietto biglietto = new Biglietto (eta, km);
		
		// Stampo a video il prezzo finale del biglietto
		System.out.println("Il prezzo del biglietto è: " + biglietto.prezzoFormattato());
		
		// Chiedo all'utente se vuole acquistare un nuovo biglietto o terminare l'operazione
		System.out.println("Cosa vuoi fare ora?");
		System.out.println("1 per comprare un nuovo biglietto - 2 per terminare");
		
		
		boolean sceltaValida= true;
		do {
		String sceltaUtente = scan.nextLine();
		if (sceltaUtente.equals("1")) { // se l'utente inserisce 1
			sceltaValida= true;
			// proseguo con il ciclo
		} else if (sceltaUtente.equals("2")) { // se l'utente inserisce 2
			// termino il ciclo
			sceltaValida = true;
			finito = true;
		} else {
			// input non valido
			System.out.println("Scelta non valida. Riprova"); // se l'utente inserisce un input non valido
			sceltaValida= false;
		}
		} while (!sceltaValida);
		
		
		}
	    System.out.println("Grazie di aver utilizzato il nostro servizio!");
		scan.close();

}
}

