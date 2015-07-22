/*
 * Il nome della classe per creare eccezioni personalizzate per convenzione è di questo tipo Nome1Nome2Exception
 * 
 * CREARE ECCEZIONE PERSONALIZZATA
 * Step 1: estendere ls classe Exception
 * Step 2: creare il messaggio iniziale, cioè andiamo a dare valore alla variabile "message"
 * Step 3; Override metodo toString() , cosi vado a prelevare la variabile "message" con getMessage(); a cui posso 
 *         aggiungere altri commenti, nel nostro caso ": divisione per zero"
 */
public class DivisionePerZeroException extends Exception{
	
	public DivisionePerZeroException(){
		super("Problema con l'operazione");   //sarà il nostro messaggio iniziale
		
		
	}

	@Override
	public String toString() {
		return getMessage()+": divisione per zero";
	}

}


/*
 * Exception è una sottoclasse della classe 
 * Throwable        <-- ha 2 costruttori
 * 1) Throwable()   <-- costruttore vuoto
 * 2) Throwable(String message)   <--viene passato una variabile messaggio, quindi ha all'interno i metodi get e set
 */

