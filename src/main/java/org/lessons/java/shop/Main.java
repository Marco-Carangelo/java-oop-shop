package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Dichiariamo delle variabili che verranno usate per acquisire i dati dei prodotti da tastiera e per popolare gli attributi degli oggetti
		
		String userProdName;
		String userProdInfo;
		float userProdPrice;
		int userProdIva;
		
		
		//Acquisiamo i valori delle variabili
		
		System.out.println("Inserisci il nome del prodotto: ");
		userProdName= scanner.nextLine();
		System.out.println("Inserisci la descrizione del prodotto: ");
		userProdInfo= scanner.nextLine();
		System.out.println("Inserisci il prezzo del prodotto, non comprensivo di IVA: ");
		userProdPrice= scanner.nextFloat();
		System.out.println("Inserisci il valore dell'Iva da applicare sul prodotto: ");
		userProdIva= scanner.nextInt();
		
		
		//Creiamo un'istanza della classe prodotto
		
		Prodotto userProd = new Prodotto(userProdName,userProdInfo,userProdPrice,userProdIva);
		
		
		
		
				
		//Richiamiamo il metodo per stampare il prezzo base del prodotto
		System.out.printf("Il prezzo di base del prodotto è: %.2f €\n" , userProd.getProdPrice());
		
		//Richiamiamo il metodo per stampare il prezzo + IVA del prodotto
		System.out.printf("Il prezzo sommato all'IVA del prodotto è: %.2f €\n", userProd.getTaxedPrice());
		
		//Richiamiamo gli altri metodi GETTER per verificarne il funzionamento
		System.out.println("Nome: " + userProd.getProdName());
		System.out.println("Descrizione: " + userProd.getProdInfo());
		System.out.println("Codice: " + userProd.getProdCode());
		
		
		
		//Verifichiamo un metodo SETTER facendo cambiare all'utente il prezzo del prodotto e ristampandolo
		
		System.out.println("Inserisci il prezzo del prodotto, non comprensivo di IVA: ");
		userProd.setProdPrice(scanner.nextFloat());
		System.out.printf("Il prezzo di base del prodotto è: %.2f €,\nIl prezzo + Iva è: %.2f €\n" , userProd.getProdPrice(),userProd.getTaxedPrice());
		
		
		
		
		//Trasformiamo il codice numerico in una stringa ed aggiungiamo l'eventuale padding nel caso fosse formato da meno di 8 cifre
		
		String paddedCode= Prodotto.paddingCode(userProd.getProdCode());
		
		//Richiamiamo il metodo per stampare il nome completo del prodotto
		System.out.println("L'identificativo completo del prodotto è: " + userProd.getFullProdName(paddedCode));
				
		scanner.close();
	}

}
