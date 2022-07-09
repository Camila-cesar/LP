/*
 * AprovadoReprovadoRandom.java
 * Camila de Paula Souza César
 * Lista 4 - exercício 1
 * 
 */


public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		
			int nota = (int) (Math.random() * 11);
		
		if(nota >= 6){
			System.out.println("APROVADO");
		}
		else{
			System.out.println("REPROVADO");
		}
	}
}

