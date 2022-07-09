/*
 * VerificaValorProduto.java
 * Camila de Paula Souza César
 * Lista 4 - exercício 4
 * 
 */

import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int precoProduto1;
		int precoProduto2;
		
		System.out.print("Digite o valor do Produto 1 (De 1 a 1000): ");
		precoProduto1 = ler.nextInt();
		
		System.out.print("Digite o valor do Produto 2 (De 1 a 1000): ");
		precoProduto2 = ler.nextInt();
		
		if (precoProduto1 > 1000 || precoProduto2 < 1 || precoProduto2 > 1000 || precoProduto1 < 1){
			System.out.println ("VALOR INVALIDO!");
		}
		else {
			if(precoProduto1 < precoProduto2){
			System.out.println("O produto 1 eh mais barato!");
			}
			if(precoProduto1 > precoProduto2){
			System.out.println("O produto 2 eh mais barato!");
			}		
			if(precoProduto1 == precoProduto2){
			System.out.println("Os precos dos dois produtos sao iguais!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

