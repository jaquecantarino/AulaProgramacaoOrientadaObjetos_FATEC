package Exercicios;

import java.util.Scanner;

//4.Fa�a um programa que receba o sal�rio de um funcion�rio, 
// calcule e mostre o novo sal�rio, sabendo-se que este sofreu um aumento de 25%.

public class Lista01_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double salario, novosalario;
		
		System.out.println("Escreva o salario atual: ");
		salario = leia.nextDouble();
	
		novosalario = (salario*0.25) + salario;
		
		System.out.println("Salario com reajuste: " + novosalario);
		
	}

}
