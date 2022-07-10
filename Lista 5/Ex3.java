/*
 * Ex3.java
 * Camila de Paula Souza César
 * lista 5 - Ex3
 * 
 */

import java.util.Scanner;

public class Ex3 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int quantidade;
		double total;
		
		System.out.print ("Numero de macas: ");
		quantidade = ler.nextInt();
		
		if (quantidade < 12){
			total = quantidade*1.3; //quantidade*=1.3;
			}
			else{
				total = quantidade;
				}
		System.out.println("Custo total: R$ "+total);
	}
}

