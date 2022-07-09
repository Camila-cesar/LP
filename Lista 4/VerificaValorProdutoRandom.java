/*
 * VerificaValorProdutoRandom.java
 * Camila de Paula Souza César
 * Lista 4 - exercício 3
 *  
 */


public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		
		int precoProduto1 = (int)(Math.random() *1000);
		int precoProduto2 = (int)(Math.random() *1000);
				
		if(precoProduto1 < precoProduto2){
			System.out.println("O produto 1 eh mais barato!");
		}
		
		if(precoProduto1 > precoProduto2){
			System.out.println("O produto 2 eh mais barato!");
		}
		
		if(precoProduto1 == precoProduto2){
			System.out.println("Os preços dos dois produtos sao iguais!");
		}
	}
}

