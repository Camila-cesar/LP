/*
 * Ex5.java
 * Camila de Paula Souza César
 * lista 5 - Ex5
 * 
 */

import java.util.Scanner;

public class Ex5 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);	
		int atual;
		int nascimento;
		
		System.out.printf("Digite o ano atual: ");
		atual = ler.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		nascimento = ler.nextInt();
		
		if(atual - nascimento >= 16){
			System.out.printf("Pode votar!");
		}
		else{
			System.out.printf("Nao pode votar!");
		}
	}
}

