package Exercicios;

import java.util.Scanner;

//5.Fa�a um programa que receba o sal�rio de um funcion�rio e o 
// percentual de aumento, calcule e mostre o valor do aumento e 
//o novo sal�rio.

public class Lista01_05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double salario, ajuste, novosalario, percentual;
		
		System.out.println("Digite o salario atual: ");
		salario = leia.nextDouble();
		System.out.println("Digite o percentual de aumento: ");
		percentual = leia.nextInt();
		
		ajuste = salario*(percentual/100);
		
		novosalario = salario + ajuste;
		
		System.out.println("O valor de ajuste �: "+ajuste);
		System.out.println("O novo salario �: "+novosalario);

	}
}
