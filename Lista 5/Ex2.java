/*
 * Ex2.java
 * Camila de Paula Souza César
 * lista 5 - Ex2
 * 
 */

import java.util.Scanner;

public class Ex2 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite um valor: ");
		valor = ler.nextDouble();
		
		if(valor < 0){
			System.out.println("Negativo");
		}else{
			System.out.println("Positivo");
		}
	}
}

