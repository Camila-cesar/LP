/*
 * Ex10.java
 * Camila de Paula Souza Cesar
 * lista 5 - Ex10
 * 
 */

import java.util.Scanner;
public class Ex10 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double salario, vendas, comissao;
		
		System.out.printf("  Salario do vendedor: R$ ");
		salario = ler.nextDouble();
		
		System.out.printf("Valor total de vendas: R$ ");
		vendas = ler.nextDouble();
		
		if(vendas <= 1500 ){
			vendas *= 0.03;
		}
		if (vendas > 1500){
			comissao = vendas - 1500;
			vendas *= 0.03;
			comissao *= 0.05;
			
			vendas += comissao;
		}
		
		salario+= vendas;
		
		System.out.printf("\n\tSalario total: R$" + salario);
	}
}

