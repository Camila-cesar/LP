/*
 * Ex8.java
 * Camila de Paula Souza César
 * lista 5 - Ex8
 * 
 */

import java.util.Scanner;

public class Ex8 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a hora de inicio: ");
		int inicio = ler.nextInt();

		System.out.println("Digite a hora final: ");
		int fim = ler.nextInt();

		int duracao = fim - inicio;

		if(duracao < 0){
		int dia = duracao + 24;
		System.out.println("O jogo teve "+dia+" horas de duracao");
		}else{
		System.out.println("O jogo teve "+duracao+" horas de duracao");
		}
	}
}

