/*
 * AprovadoReprovado.java
 * Camila de Paula Souza César
 * Lista 4 - exercício 2
 * 
 */

import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int nota;
		
		System.out.print("Digite uma nota de 0 a 10: ");
		nota = ler.nextInt();
		
		if (nota > 10 || nota < 0){
			System.out.print(" VALOR INVALIDO ");
		}		
		else {
			if (nota >=6 && nota <=10){
				System.out.print(" APROVADO ");
			}
			if (nota >= 0 && nota < 6){
				System.out.print(" REPROVADO ");
			}	
		}
		
		
	}
}

