package Exercicios;

import java.util.Scanner;

//6. Fa�a um programa que receba o sal�rio base de um funcion�rio, 
//calcule e mostre o sal�rio a receber, sabendo-se que o funcion�rio 
//tem gratifica��o de 5% sobre o sal�rio base e paga imposto de 7% 
//sobre este sal�rio.

public class Lista01_06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double salario, reajuste, salariofinal;
		
		System.out.println("Digite salario base do funcionario: ");
		salario = leia.nextDouble();
		
		reajuste = (salario*0.05)+salario;
		salariofinal = reajuste - (reajuste*0.07);
		
		System.out.println("Salario a ser pago: "+salariofinal);	

	}

}
