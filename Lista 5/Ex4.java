/*
 * Ex4.java
 * Camila de Paula Souza César
 * lista 5 - Ex4
 */

import java.util.Scanner;

public class Ex4 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double nota1, nota2, media;
		
		System.out.printf("Informe a nota 1: ");
		nota1 = ler.nextDouble();
		
		System.out.printf("Informe a nota 2: ");
		nota2 = ler.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if(media >= 6){
			System.out.printf("Aprovado! Media final: " + media);
		}
		else{
			System.out.printf("Reprovado! Media final: " + media);
		}
		
	}
}

