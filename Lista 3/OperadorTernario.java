/*
 * OperadorTernario.java
 * Camila de Paula Souza César
 * Lista 03 de exercícios - Exercício 12
 * 
 */


public class OperadorTernario {
	
	public static void main (String[] args) {
		
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		
		System.out.println((a < b) ? "a<b":"a>b");		
	}
}

