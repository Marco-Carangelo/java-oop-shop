package org.lessons.java.shop;

public class ProdUtils {
	
	static public int randomCodeGenerator( int min, int max) {
				
		return (int) (Math.random() * (max - min + 1)) + min;
	}
	
	//Metodo che prende come argomento un codice numerico e, se ha meno di 8 cifre, aggiunge 0 a sinistra per il numero di cifre mancanti 
	static public String paddingCode(int code) {
		
		String paddedCode = String.format("%08d",code);
		
		return paddedCode;
	}
	
	//Overload del metodo, in modo che accetti argomenti anche in altri formati
	
	static public String paddingCode(String code) {
		
		String paddedCode = String.format("%08s",code);
		
		return paddedCode;
	}
	
	static public String paddingCode(Short code) {
		
		String paddedCode = String.format("%08d",code);
		
		return paddedCode;
	}
	
	

}
