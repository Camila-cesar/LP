/*
 * Ex9.java
 * Camila de Paula Souza Cesar
 * lista 5 - Ex9
 * 
 */

import java.util.Scanner;
public class Ex9 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
	
		double valorh, horast, salario=0;	
		
		System.out.printf("Valor da hora: ");
		valorh = ler.nextInt();
		
		System.out.printf("Horas trabalhadas em 1 mes: ");
		horast = ler.nextInt();
		
		if(horast > 160){ // 40horas semanais x 4 = 160 horas mensais
			horast -= 160;
			horast = (horast * 1.5)+ 160;
			salario = valorh * horast;
		}
		else{
			salario = valorh * horast;
		}
				
		System.out.println("Salario Total: RS" + salario);
	}
}

/*
 *		System.out.printf("Horas trabalhadas 1 semana: ");
		horast = ler.nextInt();
		
		if(horast > 40){
			horast -= 40;
			horast = (horast * 1.5) + 40;
			salario += valorh * horast;
		}
		else{
			salario += valorh * horast;
		}
	
  		System.out.printf("Horas trabalhadas 2 semana: ");
		horast = ler.nextInt();
		
		if(horast > 40){
			horast -= 40;
			horast = (horast * 1.5) + 40;
			salario += valorh * horast;
		}
		else{
			salario += valorh * horast;
		}
		
		System.out.printf("Horas trabalhadas 3 semana: ");
		horast = ler.nextInt();
		
		if(horast > 40){
			horast -= 40;
			horast = (horast * 1.5) + 40;
			salario += valorh * horast;
		}
		else{
			salario += valorh * horast;
		}
		
		System.out.printf("Horas trabalhadas 4 semana: ");
		horast = ler.nextInt();
		
		if(horast > 40){
			horast -= 40;
			horast = (horast * 1.5) + 40;
			salario += valorh * horast;
		}
		else{
			salario += valorh * horast;
		}
 * 
 * 
 */

