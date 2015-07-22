
public class mainClass {

	public static void main(String[] args) {
        int a = 10, b = 0, c;
        
        try{
        	//Qui abbiamo bisogno di un pezzo di codice per lanciare l'eccezione
        	if(b==0){
        		throw new DivisionePerZeroException();
        	}
        	c = a/b;
        	System.out.println("Il rapporto tra " + a + " e " + b + " è " + c);
        
        } catch (DivisionePerZeroException exc){
        	System.out.println(exc.toString());
        }
        
        /*
         * POLIMORFISMO
         * Invece del catch di prima poteri utilizzare il polimorfismo e fare cosi         * 
         */
        
        catch (Exception ex){
        	if(ex instanceof ArrayIndexOutOfBoundsException) System.out.println("Messaggio 1");
        	else if(ex instanceof NullPointerException) System.out.println("Messaggio 2");
        }
        
        /*
         * Quando una classe estende una classe che estente un'altra classe che estende un particolare tipo di eccezione
         * quella classe puoi gestire solo quel tipo di eccezioni
         * 
         */
        

	}

}
