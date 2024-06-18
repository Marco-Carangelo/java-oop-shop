package org.lessons.java.shop;

public class ProdUtils {
	
	static public int randomCodeGenerator( int min, int max) {
				
		return (int) (Math.random() * (max - min + 1)) + min;
	}
	
	

}
