package Exercicios;

// 1.Faça um programa que receba quatro números inteiros, calcule e mostre 
//a soma desses números.

import java.util.Scanner;

public class Lista01_01 {

	public static void main(String[] args) {
		
		int n1,n2,n3,n4;
		int soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva um numero para primeira posição: ");
		n1 = leia.nextInt();
		
		System.out.println("Escreva um numero para segunda posição: ");
		n2 = leia.nextInt();
		
		System.out.println("Escreva um numero para terceira posição: ");
		n3 = leia.nextInt();
		
		System.out.println("Escreva um numero para quarta posição: ");
		n4 = leia.nextInt();
		
		soma = n1+n2+n3+n4;
		
		System.out.println("A soma dos 4 números digitados é: "+soma);
	}
}
