/*
 * Ex7.java
 * Camila de Paula Souza César
 * lista 5 - Ex7
 */

import java.util.Scanner;

public class Ex7 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner (System.in);
		double valor1;
		double valor2;
		
		System.out.print("Digite o valor 1: ");
		valor1 = ler.nextDouble();
		
		System.out.print("Digite o valor 2: ");
		valor2 = ler.nextDouble();
		
		if(valor1 == valor2){
			System.out.print("Valores iguais!");
		}
		else{
			if(valor1 > valor2){
				System.out.println(valor2);
				System.out.println(valor1);
			}
			else{
				System.out.println(valor1);
				System.out.println(valor2);
			}
		}
		
	}
}

