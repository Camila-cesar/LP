/*
 * OverflowUnderflow.java
 * Camila de Paula Souza César
 * Lista 03 de exercícios - Exercício 7
 * 
 */


public class OverflowUnderflow {
	
	public static void main (String[] args) {
		
		System.out.println( -2147483649L +1); //-2147483648
		System.out.println(  2147483648L -1); // 2147483647
	}
}

