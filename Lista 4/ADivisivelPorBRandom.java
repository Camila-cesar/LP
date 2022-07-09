/*
 * ADivisivelPorBRandom.java
 * Camila de Paula Souza César
 * Lista 4 - exercício 5
 */


public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		
		int a = (int)(Math.random() * 1001);
		int b = (int)(Math.random() *   21);
				
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		if(a%b == 0){
			System.out.println("Eh divisivel");
		}
		else{
			System.out.println("Nao eh divisivel");
		}
		
		
	}
}

