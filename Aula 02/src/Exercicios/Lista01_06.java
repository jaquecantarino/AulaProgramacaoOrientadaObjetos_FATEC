package Exercicios;

import java.util.Scanner;

//6. Faça um programa que receba o salário base de um funcionário, 
//calcule e mostre o salário a receber, sabendo-se que o funcionário 
//tem gratificação de 5% sobre o salário base e paga imposto de 7% 
//sobre este salário.

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
