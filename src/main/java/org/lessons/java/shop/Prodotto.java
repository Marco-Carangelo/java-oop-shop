package org.lessons.java.shop;

public class Prodotto {
	
	//Dichiarazione degli attributi della classe
	
	private int prodCode;
	private String prodName;
	private String prodInfo;
	private float prodPrice;
	private int prodIva;
	
	
	//Metodo costruttore della classe
	
	public Prodotto(String prodName,String prodInfo,float prodPrice,int prodIva) {

		//Assegnazione a prodCode di un valore random compreso tra le costanti MIN = 0 e Max = 99999999
		
		final int MIN = 0;
		final int MAX = 99999999;
		
		this.prodCode= ProdUtils.randomCodeGenerator(MIN, MAX);
			
		
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



	//L'attributo per il codice del prodotto sarà accessibile in sola lettura, quindi avrà solo il metodo getter
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
	
	
	
	

	
	
}