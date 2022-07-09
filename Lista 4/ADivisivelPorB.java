/*
 * ADivisivelPorB.java
 * Camila de Paula Souza César
 * Lista 4 - exercício 6
 */

import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("  Digite o valor do a (De 0 a 1000): ");
		a = ler.nextInt();
		
		System.out.println("\nSendo um valor menor que o valor de a");

		System.out.print("  Digite o valor do b   (De 0 a 20): ");
		b = ler.nextInt();
				if (a > 1000 || a < 0 || b > 20 || b < 0){
			System.out.println ("VALOR INVALIDO!");
			
			if (a < b){
			System.out.println ("VALOR DE A MENOR QUE O VALOR DE B!");
			}
		}	
		
		else {
			
			if(a%b == 0){
			System.out.println("\nEh divisivel");
			}
			else{
			System.out.println("\nNao eh divisivel");
			}

		}
		
	}
}

