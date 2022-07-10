/*
 * Ex1.java
 * Camila de Paula Souza César
 * lista 5 - Ex1 
 * 
 */

import java.util.Scanner;

public class Ex1 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		System.out.println("Digite um numero: ");
		n = ler.nextDouble();
		
		if(n>10){
			System.out.println("EH MAIOR QUE 10!");
		}else{
			System.out.println("NAO EH MAIOR QUE 10!");
		}
		
	}
}

