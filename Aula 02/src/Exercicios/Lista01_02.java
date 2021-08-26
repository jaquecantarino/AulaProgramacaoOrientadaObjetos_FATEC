package Exercicios;

import java.util.Scanner;

// 2.Faça um programa que receba três notas, calcule e 
// mostre a média aritmética entre elas.

public class Lista01_02 {

	public static void main(String[] args) {
		
		float p1,p2,p3;
		float soma;
		float media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a nota P1: ");
		p1 = leia.nextFloat();	
		
		System.out.println("Digite a nota P2: ");
		p2 = leia.nextFloat();
		
		System.out.println("Digite a nota P3: ");
		p3 = leia.nextFloat();
		
		soma=p1+p2+p3;
		
		media=soma/3;
		
		System.out.printf("A média aritmética é: %.2f",media);
	}
}
