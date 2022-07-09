/*
 * Saudacao.java
 * Camila de Paula Souza César
 * Lista 4 - exercício 7
 * 
 */

import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int hora;
		int aleatorio;
		
		System.out.println("Digite 1 para informar a hora manualmente \nDigite 2 para gerar aleatoriamente: ");
		aleatorio = ler.nextInt();
		
		if(aleatorio == 1){
			System.out.println("Informa a hora de 0 as 23: ");
			hora = ler.nextInt();
			
			if(hora < 0 || hora > 23){
				System.out.println("Informe um horario valido");
			}	
			else{
				if(hora >= 0 && hora <=6){
					System.out.println("Zzzzz");
				}
				if(hora >= 7 && hora <=11){
					System.out.println("Bom dia");
				}			
				if(hora >= 12 && hora <=17){
					System.out.println("Boa tarde");
				}			
				if(hora >= 18 && hora <=23){
					System.out.println("Boa noite");
				}		
			}
		}
			
		if(aleatorio == 2){
			hora = (int) (Math.random() * 24);
			
			System.out.print("\n"+hora+"hs - ");
			
			if(hora >= 0 && hora <=6){
				System.out.print("Zzzzz");
			}		
			if(hora >= 7 && hora <=11){
				System.out.print("Bom dia");
			}
			if(hora >= 12 && hora <=17){
				System.out.print("Boa tarde");
			}		
			if(hora >= 18 && hora <=23){
				System.out.print("Boa noite");
			}
		
		}
	}
}

