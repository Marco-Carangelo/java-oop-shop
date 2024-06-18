package org.lessons.java.shop;

//Questa classe conterrà un'array con tutti i prodotti che verranno inseriti
public class ListaProdotti {
	
	//Inizializziamo l'array
	Prodotto prodList[];
	
	//Metodo costruttore
	public ListaProdotti() {
		
		prodList = new Prodotto[0];
		
	}
	
	
	
	
	//Metodo per aggiungere uno o più prodotti all'array
	
	public void aggiungiProdotti(Prodotto...prodotti ) {
			
		//Creiamo un nuovo array di lunghezza pari a prodList + il parametro prodotti
		Prodotto nuovaLista[] = new Prodotto[prodList.length + prodotti.length];
			
		//Copio gli elementi di prodList in nuovalista
		for(int i=0; i<prodList.length; i++) {
				
			nuovaLista[i] = prodList[i];
		}
			
		//Copio gli elementi di prodotti nelle restanti posizioni dell'array
			
		for(int i=0; i<prodotti.length; i++) {
				
			nuovaLista[i+prodList.length] = prodotti[i];
		}
			
		//Sovrascrivo il riferimento di prodList con quello della nuova lista
			
		this.prodList = nuovaLista;
	}
	
	
	
	//Metodo per stampare tutti i prodotti nella lista
	
	public void stampaProdotti() {
		
		for(Prodotto prod:prodList) {
			
			System.out.println("********************************************");
			System.out.println("Nome: " + prod.getProdName());
			System.out.println("Descrizione: " + prod.getProdInfo());
			System.out.println("Codice: " + prod.getFullProdName());
			System.out.println("Prezzo di base: " + prod.getProdPrice() + " €");
			System.out.println("Prezzo + IVA: " + prod.getTaxedPrice() + " €");
			System.out.println("********************************************");
			
		}
	}
		
		
		
}
