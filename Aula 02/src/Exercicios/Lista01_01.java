package Exercicios;

// 1.Fa�a um programa que receba quatro n�meros inteiros, calcule e mostre 
//a soma desses n�meros.

import java.util.Scanner;

public class Lista01_01 {

	public static void main(String[] args) {
		
		int n1,n2,n3,n4;
		int soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva um numero para primeira posi��o: ");
		n1 = leia.nextInt();
		
		System.out.println("Escreva um numero para segunda posi��o: ");
		n2 = leia.nextInt();
		
		System.out.println("Escreva um numero para terceira posi��o: ");
		n3 = leia.nextInt();
		
		System.out.println("Escreva um numero para quarta posi��o: ");
		n4 = leia.nextInt();
		
		soma = n1+n2+n3+n4;
		
		System.out.println("A soma dos 4 n�meros digitados �: "+soma);
	}
}
