package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	//Dichiarazione degli attributi della classe
	
	private int prodCode;
	private String prodName;
	private String prodInfo;
	private float prodPrice;
	private int prodIva;
	
	
	//Metodo costruttore della classe
	
	public Prodotto(String prodName,String prodInfo,float prodPrice,int prodIva) {
			
		//Dichiarazione di una variabile locale per contenere un'istanza di Random
		Random r = new Random();
			
		//Assegnazione di un valore random compreso tra le costanti MIN = 10000000 e Max = 99999999
		
		final int MIN = 0;
		final int MAX = 99999999;
		
		this.prodCode= (int) (r.nextDouble() * (MAX - MIN + 1)) + MIN;
			
		//Assegnazione degli altri attributi del metodo
		this.prodName =prodName;
		this.prodInfo=prodInfo;
		this.prodPrice=prodPrice;
		this.prodIva=prodIva;
	}
	
	//***METODI GETTER E SETTER
	
		
		
	public String getProdName() {
		return prodName;
	}

	
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}




	public String getProdInfo() {
		return prodInfo;
	}




	public void setProdInfo(String prodInfo) {
		this.prodInfo = prodInfo;
	}



	//Metodo per avare il prezzo base
	public float getProdPrice() {
		return prodPrice;
	}




	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}




	public int getProdIva() {
		return prodIva;
	}




	public void setProdIva(int prodIva) {
		this.prodIva = prodIva;
	}



	//L'attributo per il codice del prodotto sarà accessibile in sola lettura, quindi avrà solo il metodo setter
	public int getProdCode() {
		return prodCode;
	}
	
	
	
		
	//Metodo per avere il prezzo + IVA
		
	public float getTaxedPrice( ) {
		
		//Restituiamo il risultato della somma tra il prezzo del prodotto e la percentuale d'IVA
		
		return prodPrice + (prodPrice*prodIva/100);
	}
	
	
	
		
	//Metodo per ottenere il nome esteso formato da "codicenumerico-nome"
		
	public String getFullProdName(String code) {
			
		//Dichiariamo una variabile locale che conterrà il nome completo del prodotto
		String fullName = String.format("%s-%s",code,prodName);
		
		return fullName;
	}
	
	
	
	
	//Metodo che prende come argomento un codice numerico e, se ha meno di 8 cifre, aggiunge 0 a sinistra per il numero di cifre mancanti 
	static public String paddingCode(int code) {
		
		String paddedCode = String.format("%08d",code);
		
		return paddedCode;
	}
	
}